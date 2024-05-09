# Write your MySQL query statement below
SELECT tweet_id from Tweets
WHERE char_length(content) > 15;