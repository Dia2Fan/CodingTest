-- 코드를 작성해주세요--
select count(fi.FISH_TYPE) as FISH_COUNT
from fish_info as fi join fish_name_info as fn on fn.fish_type = fi.fish_type
where fish_name ='bass' or fish_name ='snapper'