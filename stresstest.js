import http from "k6/http";
import {sleep, check} from "k6";


//Spike Test
export let options ={
    insecureSkipTLSVerify : true,
    noConnectionReuse : false,
    stages:[
        {duration : '5s', target : 100},
        {duration : '10s', target : 100},
        {duration : '5s', target : 200},
        {duration : '10s', target : 200},
        {duration : '5s', target : 300},
        {duration : '10s', target : 300},
        {duration : '5s', target : 400},
        {duration : '10s', target : 400},
        {duration : '5s', target : 0}
    ],
    thresholds:{
        http_req_failed:['rate<0.01']
    }
}

const base_url = 'http://localhost:5001'
export default () => {
    const responses = http.batch([
        ['GET', `${base_url}/api/songs`]
    ])
    check(responses[0], {
        'status is 200': res => res.status === 200
    })
    sleep(1);
}