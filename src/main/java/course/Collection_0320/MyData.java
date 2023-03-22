package course.Collection_0320;

//泛型類別
public class MyData<T> {
	private T obj;	//宣告屬性obj為泛型 (呼叫時才用<>宣告Type)
	
	void setObj(T obj) {
		this.obj = obj;
	}
	public T getObj() {
		return this.obj;
	}
	
	//泛型方法
	public static <E> void outputArray(E[] elements){		//宣告接受任意類型元素的陣列
		for(E element : elements) {		//遍歷輸入的"elements"陣列 , 傳值給任意類型的屬性"element"
			System.out.print(element);
		}
		System.out.println();
	}
	
	public static <T> void outputContent(T content){		//宣告接受任意類型的輸入
			System.out.print(content );
			System.out.println();
		}
	}

