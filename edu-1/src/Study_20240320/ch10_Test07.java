package Study_20240320;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ch10_Test07 {

	public static void main(String[] args) {

		HashMap<String, String> dic = new HashMap<String, String>();

		dic.put("고진감래", "고생끝에 즐거움이 옴");
		dic.put("분골쇄신", "몸이 부서질정도로 노력을 다함");
		dic.put("권토중래", "실패를 발판삼아 재기함");
		dic.put("교학상자", "가르치고 배우면서 서로 성장함");
		dic.put(null, null); // Hahmap은 null값 저장가능

		// 방법1
		Iterator<String> keys = dic.keySet().iterator();
		while (keys.hasNext()) {
			String key = keys.next();
			System.out.println(String.format("%s : %s", key, dic.get(key)));

		}

		// 방법2
		for (Map.Entry<String, String> elem : dic.entrySet()) {
			System.out.println(String.format("%s : %s", elem.getKey(), elem.getValue()));
		}

		for (String key : dic.keySet()) {
			System.out.println(String.format("%s : %s", key, dic.get(key)));
		}

	}

}
