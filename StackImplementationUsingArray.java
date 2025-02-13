// import java.util.Stack;
public class StackImplementationUsingArray {
    public static class Stack{
        private int arr[]=new int[4];
        private int index=0;
        void push(int x){
            if(isfull()){
                System.out.println("stack is empty....");
                return;
            }
            arr[index]=x;
            index++;
        }
        int peek(){
            if(index==0){
                System.out.println("stack is empty.....");
                return -1;
            }
            return arr[index-1];

        }
        int pop(){
            if(index==0){
                System.out.println("stack is empty..");
                return -1;

            }
            int top=arr[index-1];
            arr[index-1]=0;
            index--;
            return top;

        }
        void display(){
            for(int i=0;i<=index-1;i++){
                System.out.println(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return index;

        }
        boolean isEmpty(){
            if(index==0)  return true;
            else return false;
        }

        boolean isfull(){
            if(index==arr.length) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(2);
        st.push(4);
        st.push(9);
        st.push(7);
        st.display();
        st.pop();
        st.push(10);
        st.display();
        st.size();
    }
}
