import pandas as pd

def getDataframeSize(players: pd.DataFrame) -> List[int]:
    a=[]
    a.append(players.shape[0])
    a.append(players.shape[1])
    return a