import pandas as pd
import numpy as np
from sklearn.cluster import KMeans
from sklearn.cluster import AgglomerativeClustering
from sklearn.preprocessing import MinMaxScaler

dataset = pd.read_csv('heart.csv')
print(dataset)

print("\n\n2. data <-- normalisasi dengan min-max(0-1)")
sc = MinMaxScaler(feature_range=(0,1))
data = sc.fit_transform(dataset)
print("\n=============== Normalisasi ===============")
print(data)

print ("\n\n3. cluster <-- lakukan clustering pada data menggunakan K-means (k=2)")
clusteringKMeans = KMeans(n_clusters=2, init="random", n_init=1)
clustersKMeans = clusteringKMeans.fit_predict(data)
print('\nHasil clustering KMeans:\n', clustersKMeans)

print("\n\n4. cluster <-- lakukan clustering pada data dengan Single, Average, Complete Linkage, dengan k=2")
clusteringHierarchicalSingle = AgglomerativeClustering(n_clusters=2, linkage='single')
clusteringHierarchicalAverage = AgglomerativeClustering(n_clusters=2, linkage='average')
clusteringHierarchicalComplete = AgglomerativeClustering(n_clusters=2, linkage='complete')
clustersSingle = clusteringHierarchicalSingle.fit_predict(data)
clustersAverage = clusteringHierarchicalAverage.fit_predict(data)
clustersComplete = clusteringHierarchicalComplete.fit_predict(data)
print('\nHasil clustering Single:\n', clustersSingle)
print('\nHasil clustering Average:\n', clustersAverage)
print('\nHasil clustering Complete:\n', clustersComplete)

# 5 & 6

cal_val = []
for i in range(10):
    clustering = KMeans(n_clusters=3, init='random', n_init=1)
    clusters = clustering.fit_predict(data)
    print(f'\nHasil clustering {i}:\n', clusters)
    print('\nSSE = :\n', clustering.inertia_)
    cal_val.append(clustering.inertia_)
print("Nilai Terkecil: ",min(cal_val))
print("Pada Index ke: ",pd.Series(cal_val).idxmin())
