
/**
 * �Ի����˶��͹���ϵͳ
 * 
 * @author rong.zhou
 * 
 */
import java.util.Scanner;
public class Chihuo {
	public static void main(String[] args){
			// �������壺һ�鶩����Ϣ
			String[] names = new String[4]; // ����������
			String[] dishMegs = new String[4]; // ��ѡ��Ʒ
			int[] times = new int[4]; // �Ͳ�ʱ��
			String[] addresses = new String[4]; // �Ͳ͵�ַ
			int[] states = new int[4]; // ����״̬�� 0����Ԥ�� 1�������
			double[] sumPrices = new double[4]; // �ܽ��
			
			//��ʼ��2��������Ϣ
			names[0] = "����";
			dishMegs[0] = "���մ��� 2��";
			times[0] = 12;
			addresses[0] = "���·207��";
			sumPrices[0] = 76.0;
			states[0] = 1;
			
			names[1] = "����";
			dishMegs[1] = "������˿ 2��";
			times[1] = 18;
			addresses[1] = "���·207��";
			sumPrices[1] = 20.0;
			
			
			// ��ѡ��Ĳ�Ʒ��Ϣ
			String[] dishNames = { "���մ���", "������˿", "ʱ������" }; // ��Ʒ����
			double[] prices = new double[] { 38.0, 20.0, 10.0 }; // ��Ʒ����
			int[] praiseNums = new int[3];

			Scanner input = new Scanner(System.in);
			int num = -1; // �û�����0�������˵��������˳�ϵͳ
			boolean isExit = false; // ��־�û��Ƿ��˳�ϵͳ�� true:�˳�ϵͳ

			System.out.println("\n��ӭʹ�á��Ի����˶���ϵͳ��");
			// ѭ������ʾ�˵��������û�ѡ�������ִ����Ӧ����
			do {
				// ��ʾ�˵�			
				System.out.println("****************************");
				System.out.println("1����Ҫ����");
				System.out.println("2���鿴�ʹ�");
				System.out.println("3��ǩ�ն���");
				System.out.println("4��ɾ������");
				System.out.println("5����Ҫ����");
				System.out.println("6���˳�ϵͳ");
				System.out.println("****************************");
				System.out.print("��ѡ��");
				int choose = input.nextInt(); // ��¼�û�ѡ��Ĺ��ܱ��
				boolean isAdd = false;  //��¼�Ƿ���Զ���
				boolean isSignFind = false;  //�ҵ�Ҫǩ�յĶ���
				boolean isDelFind = false;  //�ҵ�Ҫɾ���Ķ���
				// �����û�ѡ��Ĺ��ܱ��ִ����Ӧ����
				switch (choose) {
				case 1:
					// ��Ҫ����
					System.out.println("***��Ҫ����***");
					for (int j = 0; j < names.length; j++) {					
	                   if(names[j] == null){  //�ҵ���һ����λ�ã�������Ӷ�����Ϣ
	                	   isAdd = true;  //�ñ�־λ�����Զ���
	                	   System.out.print("�����붩����������");
	   					String name = input.next(); 
						// ��ʾ��ѡ��Ĳ�Ʒ��Ϣ
						System.out.println("���" + "\t" + "����"+"\t"+"����");
						for (int i = 0; i < dishNames.length; i++) {
							String price = prices[i] + "Ԫ";
							String priaiseNum = (praiseNums[i]) > 0 ? praiseNums[i]
									+ "��" : "";
							
							System.out.println((i + 1) + "\t" + dishNames[i] + "\t"	+price+"\t"+ priaiseNum);
						}
						// �û����
						System.out.print("��ѡ����Ҫ��Ĳ�Ʒ���:");
						int chooseDish = input.nextInt();
						System.out.print("��ѡ������Ҫ�ķ���:");
						int number = input.nextInt();
						String dishMeg =  dishNames[chooseDish - 1]
								+" "+ number + "��";
						double sumPrice = prices[chooseDish - 1] * number;
						//�ͷ���50Ԫ�����Ͳͷ�10Ԫ
						double deliCharge = (sumPrice>=50)?0:6;                   

						System.out.print("�������Ͳ�ʱ�䣨�Ͳ�ʱ����10����20��������Ͳͣ�:");
						int time = input.nextInt();
						while (time < 10 || time > 20) {
							System.out.print("������������������10~20���������");
							time = input.nextInt();
						}
						System.out.print("�������Ͳ͵�ַ��");
						String address = input.next();
											
						//�������״̬��Ĭ����0������Ԥ��״̬��
						System.out.println("���ͳɹ���");
						System.out.println("�������ǣ�"+dishMeg);
						System.out.println("�Ͳ�ʱ�䣺"+time+"��");
						System.out.println("�ͷѣ�"+sumPrice+"Ԫ���Ͳͷ�"+deliCharge+"Ԫ���ܼƣ�"+(sumPrice+deliCharge)+"Ԫ��");
						
						//�������
						names[j] = name;
						dishMegs[j] = dishMeg;
						times[j] = time;
						addresses[j] = address;
						sumPrices[j] = sumPrice+deliCharge;
						
						break;					
	                   }
					}
					if(!isAdd){
						System.out.println("�Բ������Ĳʹ�������");
					}
					break;
				case 2:
					// �鿴�ʹ�
					System.out.println("***�鿴�ʹ�***");
					System.out.println("���\t������\t��Ʒ��Ϣ\t\t�Ͳ�����\t�Ͳ͵�ַ\t\t�ܽ��\t����״̬");
					for(int i=0;i<names.length;i++){
						if(names[i]!=null){  
							String state = (states[i]==0)?"��Ԥ��":"�����";
							String date = times[i]+"��";
							String sumPrice = sumPrices[i]+"Ԫ";
							System.out.println((i+1)+"\t"+names[i]+"\t"+dishMegs[i]+"\t"+date+"\t"+addresses[i]+"\t"+sumPrice+"\t"+state);
						}
					}
					break;
				case 3:
					// ǩ�ն���
					System.out.println("***ǩ�ն���***");
					System.out.print("��ѡ��Ҫǩ�յĶ�����ţ�");
					int signOrderId = input.nextInt();
					for(int i=0;i<names.length;i++){
						//״̬Ϊ��Ԥ�������Ϊ�û�����Ķ�����ţ���ǩ��
						//״̬Ϊ����ɣ����Ϊ�û������������ţ�����ǩ��					
						if(names[i]!=null && states[i]==0 && signOrderId==i+1){
							states[i] = 1; //��״ֵ̬��Ϊ�����
							System.out.println("����ǩ�ճɹ���");
							isSignFind = true;
						}else if(names[i]!=null && states[i]==1 && signOrderId==i+1){
							System.out.println("��ѡ��Ķ��������ǩ�գ������ٴ�ǩ�գ�");
							isSignFind = true;
						}
					}
					//δ�ҵ��Ķ�����ţ�����ǩ��
					if(!isSignFind){
						System.out.println("��ѡ��Ķ��������ڣ�");
					}
					break;
				case 4:
					// ɾ������
					System.out.println("***ɾ������***");
					System.out.print("������Ҫɾ���Ķ������:");
					int delId = input.nextInt();
					for(int i=0;i<names.length;i++){
						//״ֵ̬Ϊ�����  ���ֵΪ�û��������ţ���ɾ��
						//״ֵ̬Ϊ��Ԥ��  ���ֵΪ�û��������ţ�����ɾ��
						if(names[i]!=null && states[i]==1 && delId==i+1){	
							isDelFind = true;
							//ִ��ɾ������:ɾ��λ�ú��Ԫ������ǰ��
							for(int j=delId-1;j<names.length-1;j++){
								names[j] = names[j+1];
								dishMegs[j] = dishMegs[j+1];
								times[j] = times[j+1];
								addresses[j] = addresses[j+1];
								states[j] = states[j+1];
							}
							//���һλ���
							names[names.length-1] = null;
							dishMegs[names.length-1] = null;
							times[names.length-1] = 0;
							addresses[names.length-1] = null;
							states[names.length-1] = 0;
							
							System.out.println("ɾ�������ɹ���");
							break;
						}else if(names[i]!=null && states[i]==0 && delId==i+1){
							System.out.println("��ѡ��Ķ���δǩ�գ�����ɾ����");
							isDelFind = true;
							break;
						}
					}
					
					//δ�ҵ�����ŵĶ���������ɾ��
					if(!isDelFind){
						System.out.println("��Ҫɾ���Ķ��������ڣ�");
					}							
					break;
				case 5:
					// ��Ҫ����
					System.out.println("***��Ҫ����***");
					// ��ʾ��Ʒ��Ϣ
					System.out.println("���" + "\t" + "����"+"\t"+"����");
					for (int i = 0; i < dishNames.length; i++) {
						String price = prices[i] + "Ԫ";
						String priaiseNum = (praiseNums[i]) > 0 ? praiseNums[i]
								+ "��" : "0��";
						
						System.out.println((i + 1) + "\t" + dishNames[i] + "\t"	+price+"\t"+ priaiseNum);
					}
					System.out.print("��ѡ����Ҫ���޵Ĳ�Ʒ��ţ�");
					int priaiseNum = input.nextInt();
					praiseNums[priaiseNum-1]++;  //������1
					System.out.println("���޳ɹ���");
					break;
				case 6:
					// �˳�ϵͳ
					isExit = true;
					break;
				default:
					//�˳�ϵͳ
					isExit = true;
					break;
				}
				if (!isExit) {
					System.out.print("����0���أ�");
					num = input.nextInt();
				} else {
					break;
				}
			} while (num == 0);
			System.out.println("ллʹ�ã���ӭ�´ι��٣�");
		}
}


