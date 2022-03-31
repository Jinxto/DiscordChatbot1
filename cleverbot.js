const cleverbot = require("cleverbot-free");

var args = process.argv.slice(2);
var text = "";

for(i = 0; i<args.length; i++){
    text+= args[i]+" ";
}
cleverbot(text).then((cleverbot) => {
 var yes = console.log(cleverbot);
}) 
