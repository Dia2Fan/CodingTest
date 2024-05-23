-- 코드를 작성해주세요--
select ITEM_INFO.ITEM_ID, ITEM_INFO.ITEM_NAME
from ITEM_INFO join ITEM_TREE on Item_Info.ITEM_ID = Item_tree.ITEM_ID 
where parent_item_id is null