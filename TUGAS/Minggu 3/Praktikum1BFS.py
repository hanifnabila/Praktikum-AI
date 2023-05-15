graph = {
    '1': ['2', '3'],
    '2': ['5', '4'],
    '3': ['4', '6'],
    '4': ['5', '6','7','8'],
    '5': ['7'],
    '6': ['8','9'],
    '7': ['9'],
    '8': ['9'],
    '9': []
}

visited = []
queue = []

def bfs(visited, graph, node):
  visited.append(node)
  queue.append(node)

  while queue:
    m = queue.pop(0)
    print(m, end = " ")

    for neighbour in graph[m]:
      if neighbour not in visited:
        visited.append(neighbour)
        queue.append(neighbour)

# Driver Code
print("Following is the Breadth-First Search")
bfs(visited, graph, 'A')