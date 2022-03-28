public class Api {
    // rest controller for the api
    @RequestMapping(value = "/api/v1/{id}", method = RequestMethod.GET)
    public @ResponseBody
    String getUser(@PathVariable("id") String id) {
        return "Hello " + id;
    }
}
