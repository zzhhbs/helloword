package cn.soso.service;

import cn.soso.entity.MobileCard;

/**
 * ͨ������ӿ�
 *
 *
 */
public interface CallService {
	//��绰
      public int call(int minCount, MobileCard card) throws Exception;
}
