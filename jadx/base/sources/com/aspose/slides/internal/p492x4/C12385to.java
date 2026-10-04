package com.aspose.slides.internal.p492x4;

import com.aspose.slides.Collections.Generic.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.aspose.slides.internal.x4.to */
/* JADX INFO: loaded from: classes5.dex */
public class C12385to extends C12386x1 {

    /* JADX INFO: renamed from: du */
    private boolean f41378du;

    /* JADX INFO: renamed from: h4 */
    private C12383kk f41379h4;

    /* JADX INFO: renamed from: to */
    private Matcher f41380to;

    /* JADX INFO: renamed from: com.aspose.slides.internal.x4.to$k4 */
    public class k4 {

        /* JADX INFO: renamed from: kk */
        private int f41382kk;

        /* JADX INFO: renamed from: x1 */
        private int f41383x1;

        private k4() {
            this.f41383x1 = -1;
            this.f41382kk = -1;
        }
    }

    private C12385to(Matcher matcher) {
        super(matcher.group(), false);
        this.f41380to = matcher;
        this.f41378du = matcher.find();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m9 */
    private List<String> m58003m9() {
        String str = ((C12386x1) this).f41387k4;
        List<String> list = new List<>();
        List list2 = new List();
        k4 k4Var = new k4();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (str.charAt(i3) == '[' && !m58002k4(str, i3)) {
                i++;
            } else if (str.charAt(i3) == ']' && !m58002k4(str, i3)) {
                i--;
            } else if (i <= 0) {
                if (str.charAt(i3) == '(') {
                    i2++;
                    if (i2 <= 1 && (i3 <= 0 || str.charAt(i3 - 1) != '\\')) {
                        int i4 = i3 + 1;
                        if (str.charAt(i4) != '?' && (i3 <= 0 || str.charAt(i3 - 1) != '\\' || i3 <= 1 || str.charAt(i3 - 2) == '\\')) {
                            k4Var.f41383x1 = i4;
                        }
                    }
                } else if (str.charAt(i3) == ')' && i2 - 1 <= 0 && ((str.charAt(i3 - 1) != '\\' || str.charAt(i3 - 2) == '\\') && k4Var.f41383x1 >= 0)) {
                    k4Var.f41382kk = i3;
                    list2.add(k4Var);
                    k4Var = new k4();
                }
            }
        }
        list.addItem(str);
        List.Enumerator it = list2.iterator();
        while (it.hasNext()) {
            k4 k4Var2 = (k4) it.next();
            list.add(str.substring(k4Var2.f41383x1, k4Var2.f41382kk));
        }
        return list;
    }

    /* JADX INFO: renamed from: du */
    public C12383kk m58004du() {
        if (this.f41379h4 == null) {
            this.f41379h4 = new C12383kk(this, m58003m9());
        }
        return this.f41379h4;
    }

    /* JADX INFO: renamed from: h4 */
    public C12385to m58005h4() {
        return new C12385to(this.f41380to);
    }

    @Override // com.aspose.slides.internal.p492x4.C12382k4
    /* JADX INFO: renamed from: k4 */
    public int mo57994k4() {
        return this.f41380to.start();
    }

    @Override // com.aspose.slides.internal.p492x4.C12386x1, com.aspose.slides.internal.p492x4.C12382k4
    /* JADX INFO: renamed from: kk */
    public String mo57995kk() {
        return this.f41380to.group();
    }

    @Override // com.aspose.slides.internal.p492x4.C12386x1
    /* JADX INFO: renamed from: to */
    public boolean mo58006to() {
        return this.f41378du;
    }

    @Override // com.aspose.slides.internal.p492x4.C12382k4
    public String toString() {
        return mo57995kk();
    }

    @Override // com.aspose.slides.internal.p492x4.C12386x1, com.aspose.slides.internal.p492x4.C12382k4
    /* JADX INFO: renamed from: x1 */
    public int mo57996x1() {
        return this.f41380to.end() - this.f41380to.start();
    }

    public C12385to(Pattern pattern, String str) {
        super(str, pattern.pattern(), false);
        Matcher matcher = pattern.matcher(str);
        this.f41380to = matcher;
        this.f41378du = matcher.find();
    }

    /* JADX INFO: renamed from: k4 */
    public static Matcher m58001k4(C12385to c12385to) {
        if (c12385to == null) {
            return null;
        }
        return c12385to.f41380to;
    }

    public C12385to(Pattern pattern, String str, int i) {
        super(str, pattern.pattern(), false);
        Matcher matcher = pattern.matcher(str);
        this.f41380to = matcher;
        this.f41378du = matcher.find(i);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m58002k4(String str, int i) {
        boolean z = false;
        while (true) {
            i--;
            if (i < 0 || str.charAt(i) != '\\') {
                break;
            }
            z = !z;
        }
        return z;
    }
}
