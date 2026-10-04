package com.aspose.slides;

import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class pe5 {

    /* JADX INFO: renamed from: c5 */
    private static final String f48038c5;

    /* JADX INFO: renamed from: du */
    public static final C12380dy f48039du;

    /* JADX INFO: renamed from: dy */
    public static final C12380dy f48040dy;

    /* JADX INFO: renamed from: h4 */
    public static final C12380dy f48041h4;

    /* JADX INFO: renamed from: k4 */
    public static int f48042k4;

    /* JADX INFO: renamed from: kk */
    public static final C12380dy f48043kk;

    /* JADX INFO: renamed from: m9 */
    public static final C12380dy f48044m9;

    /* JADX INFO: renamed from: to */
    public static final C12380dy f48045to;

    /* JADX INFO: renamed from: x1 */
    public static final C12380dy f48046x1;

    static {
        String strM67408k4 = C14113y2.m67408k4("(", "<p:sp>", "|", "<p:ph", ")");
        f48038c5 = strM67408k4;
        f48046x1 = new C12380dy(C14113y2.m67402k4("(({0})|({1}({2}){3}))", strM67408k4, "<a:t>", "(.*?)", "</a:t>"), 0);
        f48043kk = new C12380dy(C14113y2.m67402k4("(({0})|({1}({2}){3}))", "<a:p>", "<a:t>", "(.*?)", "</a:t>"), 0);
        f48045to = new C12380dy(C14113y2.m67402k4("{0}{1}{2}", "<c:v>", "(.*?)", "</c:v>"), f48042k4);
        f48039du = new C12380dy("(<a:off\\sx=\"(\\-?[0-9]+)\"\\sy=\"(\\-?[0-9]+)\".*?<a:chOff\\sx=\"(\\-?[0-9]+)\"\\sy=\"(\\-?[0-9]+)\")", 4);
        f48041h4 = new C12380dy("((<p:grpSp>(.*?)</p:grpSp>)|(<p:sp>(.*?)</p:sp>)|(<p:graphicFrame>(.*?)</p:graphicFrame>))", 4);
        f48044m9 = new C12380dy(C14113y2.m67402k4("{0}|{1}|{2}", "(<a:p>.*?</a:p>)", "(<a:off\\sx=\"(\\-?[0-9]+)\"\\sy=\"(\\-?[0-9]+)\".*?<a:ext\\scx=\"([0-9]+)\"\\scy=\"([0-9]+)\")", "((<p:ph\\s*?type=\"([a-zA-Z0-9]+)\".*?idx=\"([0-9]+)\")|(<p:ph\\s*?type=\"([a-zA-Z0-9]+))|(<p:ph.*?idx=\"([0-9]+)))"), 4);
        f48040dy = new C12380dy("(<a:t>(.*?)</a:t>)|(<a:br>.*?</a:br>)", 4);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69032k4() {
    }
}
