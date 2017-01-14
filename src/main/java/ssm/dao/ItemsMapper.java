package ssm.dao;


import org.springframework.stereotype.Repository;
import ssm.po.Items;
import ssm.po.ItemsCustom;


import java.util.List;

@Repository
public interface ItemsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Items record);

    int insertSelective(Items record);

    Items selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Items record);

    int updateByPrimaryKey(Items record);

    List<Items> queryItems() throws Exception;
}