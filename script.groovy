def systemout = new StringBuffer(), systemerr = new StringBuffer()

def proc ='./run.sh'.execute()

def runProc(){
    proc.consumeProcessOutput(systemout, systemerr)
    proc.waitForProcessOutput()
    println systemout
}
