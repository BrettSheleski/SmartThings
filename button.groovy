preferences {
  section ("Allow external service to control these things...") {
    input "buttons", "capability.button", multiple: true, required: 
true
  }
}

mappings {
  path("/") {
    action: [
      GET: "getState",
      PUT: "putState"
    ]
  }
}

def getState() {}

def putState() {}
