package ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.dao.ItemsMapper;
import ssm.po.Items;
import ssm.po.ItemsCustom;
import ssm.po.ItemsQueryVo;
import ssm.service.ItemsService;

import javax.annotation.Resource;
import java.util.List;


@Service("itemService")
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapper itemsMapper;

    public List<Items> queryItemsByVo() throws Exception {
        return itemsMapper.queryItems();
    }

    public Items selectByPrimaryKey(Integer id) throws Exception {
        return itemsMapper.selectByPrimaryKey(id);
    }
}
