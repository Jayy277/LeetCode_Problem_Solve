import pandas as pd

def findHeavyAnimals(animals: pd.DataFrame) -> pd.DataFrame:
    df=animals.sort_values("weight",ascending=False)
    return df[df["weight"]>100][["name"]]