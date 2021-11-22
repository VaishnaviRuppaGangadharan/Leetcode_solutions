class Solution:
    def interpret(self, command: str) -> str:
        vdict = {"()":"o", "(al)":"al"}
        for key in vdict:
            command = command.replace(key, vdict[key])
        return command
        