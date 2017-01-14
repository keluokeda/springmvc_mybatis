package ssm.service;

import ssm.po.Items;
import ssm.po.ItemsCustom;
import ssm.po.ItemsQueryVo;

import java.util.List;

public interface ItemsService {
    List<Items> queryItemsByVo() throws Exception;

    Items selectByPrimaryKey(Integer id) throws Exception;
}
