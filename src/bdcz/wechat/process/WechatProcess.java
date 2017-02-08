/**
 * 
 */
package bdcz.wechat.process;

import bdcz.wechat.entity.ReceiveXmlEntity;

/**
 * @author PLF
 *
 */
public class WechatProcess {

	/** 
     * ��������xml����ȡ���ܻظ������ͨ��ͼ�������api�ӿڣ� 
     * @param xml ���յ���΢������ 
     * @return  ���յĽ��������xml��ʽ���ݣ� 
     */  
    public String processWechatMag(String xml){ 
    	
    	System.out.println(xml);
        /** ����xml���� */  
        ReceiveXmlEntity xmlEntity = new ReceiveXmlProcess().getMsgEntity(xml);  
        
        /** ���ı���ϢΪ��������ͼ�������api�ӿڣ���ȡ�ظ����� */  
        String result = "";  
        if("text".endsWith(xmlEntity.getMsgType())){  
            result = new TulingApiProcess().getTulingResult(xmlEntity.getContent());  
        }
        else if("event".endsWith(xmlEntity.getMsgType())){
        	if("V1001_TODAY_MUSIC".endsWith(xmlEntity.getEventKey())){
        		result = "����Ϊ������Ѧ֮ǫ�ġ���˹֡�";
        	}
        }
        
          
        /** ��ʱ������û�������ǡ���á����ھ�������Ĺ���֮��resultΪ����Ҳ�á����Ƶ�����  
         *  ��Ϊ���ջظ���΢�ŵ�Ҳ��xml��ʽ�����ݣ�������Ҫ�����װΪ�ı����ͷ�����Ϣ 
         * */  
        result = new FormatXmlProcess().formatXmlAnswer(xmlEntity.getFromUserName(), xmlEntity.getToUserName(), result);  
          
        return result;  
    }
}
