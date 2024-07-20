# restAPI-HashMap

ApiService.java:
- getAllEntries: Returns a map of all entries.
- getEntryById: Returns the value of the entry with the specified ID.
- addEntry: Adds a new entry with the specified ID and value.
- updateEntry: Updates the value of the entry with the specified ID.
- deleteEntry: Deletes the entry with the specified ID.


ApiController.java:
- getAllEntries: Handles GET requests to /api/entries.
- getEntryById: Handles GET requests to /api/entries/{id}.
- addEntry: Handles POST requests to /api/entries.
- updateEntry: Handles PUT requests to /api/entries/{id}.
- deleteEntry: Handles DELETE requests to /api/entries/{id}.