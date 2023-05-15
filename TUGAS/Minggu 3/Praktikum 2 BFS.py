graph = {
    '0': ['3', '4'],
    '1': ['0', '6'],
    '2': ['5', '4'],
    '3': ['1', '7'],
    '4': ['6'],
    '5': ['6', '7'],
    '6': ['2','4'],
    '7': ['5']
}

visited = []
queue = []

def bfs(visited, graph, node):
  visited.append(node)
  queue.append(node)

  while queue:
    m = queue.pop(0)
    print (m, end = " ")

    for neighbour in graph[m]:
      if neighbour not in visited:
        visited.append(neighbour)
        queue.append(neighbour)

print("Following is the Breadth-First Search")
bfs(visited, graph, '0  ')