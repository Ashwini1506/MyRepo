package Javaprograms;

public class CallByReferenceCallByValue
{

        int data=50;

        void change(int data){
            data=data+100;//changes will be in the local variable only
            System.out.println("method data"+data);
        }

        public static void main(String args[]){
            CallByReferenceCallByValue op=new CallByReferenceCallByValue();

            System.out.println("before change "+op.data);
            op.change(500);//call by value
            System.out.println("after change "+op.data);

        }
}





