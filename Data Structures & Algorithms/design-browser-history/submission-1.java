public class BrowserHistory {
    private List<String> history;
    private int cur;
    private int n;

    public BrowserHistory(String homepage) {
        history = new ArrayList<>();
        history.add(homepage);
        cur = 0;
        n = 1;
    }

    public void visit(String url) {
        cur++;
        if (cur == history.size()) {
            history.add(url);
        } else {
            history.set(cur, url);
        }
        n = cur + 1;
    }

    public String back(int steps) {
        cur = Math.max(0, cur - steps);
        return history.get(cur);
    }

    public String forward(int steps) {
        cur = Math.min(n - 1, cur + steps);
        return history.get(cur);
    }
}