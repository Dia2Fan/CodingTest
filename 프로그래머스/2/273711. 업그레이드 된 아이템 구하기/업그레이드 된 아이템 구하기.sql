-- 
select     info.ITEM_ID, 
    info.ITEM_NAME, 
    info.RARITY
FROM 
    ITEM_TREE AS upgrade
JOIN 
    ITEM_INFO AS info ON upgrade.ITEM_ID = info.ITEM_ID
where upgrade.PARENT_ITEM_ID in (select item_id
from ITEM_INFO
where rarity ='RARE')
ORDER BY 
    upgrade.ITEM_ID DESC;