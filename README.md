
To get JWT token
POST http://localhost:8089/realms/myrealm/protocol/openid-connect/token
x-www-url-form-enoded
{
    grant_type: password
    client_id: myclient
    username: user
    password: user
}

Send GET to role protected endpoints to test