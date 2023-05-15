# Clustering with k-Means
import pandas as pd
from sklearn.cluster import KMeans

dataset = pd.read_csv('ruspini.csv')
data = dataset.loc[:,['X','Y']]

clustering = KMeans(n_clusters=4, init="random", n_init=1)
clusters = clustering.fit_predict(data)

print('\nHasil clustering:\n', clusters)

data.plot(x='X', y='Y', kind='scatter', c=clusters, colormap='Paired')


# Clustering with Hierarchical Clustering

import pandas as pd
from sklearn.cluster import AgglomerativeClustering

dataset = pd.read_csv('ruspini.csv')
data = dataset.loc[:,['X','Y']]

clustering = AgglomerativeClustering(n_clusters=4, linkage='average')
clusters=clustering.fit_predict(data)

print('\nHasil clustering:\n', clusters)

data.plot(x='X', y='Y', kind='scatter', c=clusters, colormap='Paired')



# Clustering with SSE

import pandas as pd
from sklearn.cluster import KMeans

dataset = pd.read_csv('ruspini.csv')
data = dataset.loc[:,['X','Y']]

clustering = KMeans(n_clusters=4, init="random", n_init=1)
clusters=clustering.fit_predict(data)

print('\nHasil clustering:\n', clusters)

print('\nSSE = :\n', clustering.inertia_)


