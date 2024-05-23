-- 코드를 작성해주세요--
SELECT count(*) as FISH_COUNT,FISH_NAME
FROM FISH_INFO AS fi 
LEFT JOIN FISH_NAME_INFO AS fni ON fi.Fish_type = fni.fish_type
GROUP BY fni.FISH_NAME
order by count(*) desc