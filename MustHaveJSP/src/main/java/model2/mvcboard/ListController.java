package model2.mvcboard;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utils.BoardPage;

public class ListController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException{
		
		MVCBoardDAO dao = new MVCBoardDAO();
		Map<String, Object> map = new HashMap<String, Object>();
		String searchField = req.getParameter("searchField");
		String searchWord = req.getParameter("searchWord");
		if(searchWord !=null) {
			map.put("searchField", searchField);
			map.put("searchWord", searchWord);
			
		}
		int totalCount = dao.selectCount(map);
		
		/*페이지 처리 start*/
		ServletContext application = getServletContext();
		int pageSize = Integer.parseInt(application.getInitParameter("POSTS_PER_PAGE"));
		int blockPage = Integer.parseInt(application.getInitParameter("PAGES_PER_BLOCK"));
		
		int pageNum=1;
		String pageTemp = req.getParameter("pageNum");
		if (pageTemp !=null && !pageTemp.equals(""))
			pageNum = Integer.parseInt(pageTemp);
			
//		int start = (pageNum-1)*pageSize +1;
//		int end = pageNum * pageSize;
//		map.put("start", start);
//		map.put("end", end);
		int start = (pageNum-1)*pageSize;
		map.put("start", start);
		map.put("pageSize", pageSize);	// MySQL은 시작 인덱스(0부터 시작)와 페이지 사이즈를 이용해서 페이징 질의를 한다.
			
		List<MVCBoardDTO> boardLists = dao.selectListPage(map);
		dao.close();
		
		String pagingImg = BoardPage.pagingStr(totalCount, pageSize, blockPage, pageNum, "../mvcboard/list.do");
		map.put("pagingImg", pagingImg);
		map.put("totalCount", totalCount);
		map.put("pageSize", pageSize);
		map.put("pageNum", pageNum);
				
		req.setAttribute("boardLists", boardLists);
		req.setAttribute("map", map);
		req.getRequestDispatcher("/14MVCBoard/List.jsp").forward(req, resp);
	}
}
