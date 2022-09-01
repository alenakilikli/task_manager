# task_manager

Create a client-server application for task management.

**TCP Server should support APIs**

- create task
- find all not completed tasks
- find tasks by assigned person
- find all tasks to complete this week
- delete task by name

**Task’s fields:** 

- name: string
- is completed: boolean
- assigned person: string
- created date: local date
- completion date: local date

**Implementation notes:** 

- task names should be unique
- tasks should be persisted to FS by TCP server
- on server start, it is necessary to load all tasks from FS
- each update should persist tasks to FS
- *each task should be saved to a separate file
    - motivation-1: FS will ensure uniqueness
    - motivation-2: the system should work fast with 10,000s of tasks
