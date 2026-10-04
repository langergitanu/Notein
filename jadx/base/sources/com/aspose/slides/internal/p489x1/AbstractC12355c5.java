package com.aspose.slides.internal.p489x1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.x1.c5 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12355c5 {

    /* JADX INFO: renamed from: du */
    protected String f41328du;

    /* JADX INFO: renamed from: h4 */
    protected InterfaceC12366up f41329h4;

    /* JADX INFO: renamed from: k4 */
    protected int f41330k4;

    /* JADX INFO: renamed from: kk */
    protected List f41331kk;

    /* JADX INFO: renamed from: to */
    protected boolean f41332to;

    /* JADX INFO: renamed from: x1 */
    protected Object f41333x1;

    public AbstractC12355c5(InterfaceC12366up interfaceC12366up, String str) {
        this.f41330k4 = 0;
        this.f41332to = false;
        this.f41328du = str;
        this.f41329h4 = interfaceC12366up;
    }

    /* JADX INFO: renamed from: du */
    public int m57896du() {
        int i = this.f41333x1 != null ? 1 : 0;
        List list = this.f41331kk;
        return list != null ? list.size() : i;
    }

    /* JADX INFO: renamed from: k4 */
    public void m57897k4() {
        this.f41330k4 = 0;
        this.f41332to = true;
    }

    /* JADX INFO: renamed from: kk */
    public Object m57899kk() {
        int iM57896du = m57896du();
        if (iM57896du == 0) {
            throw new C12358dy(this.f41328du);
        }
        int i = this.f41330k4;
        if (i >= iM57896du) {
            if (iM57896du == 1) {
                return mo57900kk(this.f41333x1);
            }
            throw new C12360h4(this.f41328du);
        }
        Object obj = this.f41333x1;
        if (obj != null) {
            this.f41330k4 = i + 1;
            return mo57900kk(obj);
        }
        Object objMo57900kk = mo57900kk(this.f41331kk.get(i));
        this.f41330k4++;
        return objMo57900kk;
    }

    /* JADX INFO: renamed from: to */
    public boolean m57901to() {
        List list;
        return (this.f41333x1 != null && this.f41330k4 < 1) || ((list = this.f41331kk) != null && this.f41330k4 < list.size());
    }

    /* JADX INFO: renamed from: x1 */
    public Object m57902x1() {
        int iM57896du = m57896du();
        return (this.f41332to || (this.f41330k4 >= iM57896du && iM57896du == 1)) ? mo57903x1(m57899kk()) : m57899kk();
    }

    /* JADX INFO: renamed from: x1 */
    public abstract Object mo57903x1(Object obj);

    public AbstractC12355c5(InterfaceC12366up interfaceC12366up, String str, Object obj) {
        this(interfaceC12366up, str);
        m57898k4(obj);
    }

    /* JADX INFO: renamed from: k4 */
    public void m57898k4(Object obj) {
        if (obj == null) {
            return;
        }
        List list = this.f41331kk;
        if (list != null) {
            list.add(obj);
            return;
        }
        if (this.f41333x1 == null) {
            this.f41333x1 = obj;
            return;
        }
        ArrayList arrayList = new ArrayList(5);
        this.f41331kk = arrayList;
        arrayList.add(this.f41333x1);
        this.f41333x1 = null;
        this.f41331kk.add(obj);
    }

    /* JADX INFO: renamed from: kk */
    public Object mo57900kk(Object obj) {
        return obj;
    }
}
