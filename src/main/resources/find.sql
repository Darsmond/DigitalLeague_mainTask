select users.user_id, users.first_name
                             from (myschema.users left join myschema.orders
                                  on users.user_id = orders.user_id)
                           where confirmed = true