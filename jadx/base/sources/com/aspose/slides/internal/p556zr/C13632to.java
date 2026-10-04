package com.aspose.slides.internal.p556zr;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.ArgumentException;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.zr.to */
/* JADX INFO: loaded from: classes5.dex */
public class C13632to implements Iterable<C13631kk> {

    /* JADX INFO: renamed from: k4 */
    private final ArrayList f45304k4 = new ArrayList();

    /* JADX INFO: renamed from: x1 */
    private int f45305x1 = 0;

    /* JADX INFO: renamed from: to */
    private int m62940to() {
        return m62941x1(this.f45305x1);
    }

    /* JADX INFO: renamed from: x1 */
    private int m62941x1(int i) {
        if (i < m62942k4()) {
            return i;
        }
        throw new ArgumentException("Position is out of range!");
    }

    @Override // java.lang.Iterable
    public Iterator<C13631kk> iterator() {
        return this.f45304k4.iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public int m62942k4() {
        return this.f45304k4.size();
    }

    /* JADX INFO: renamed from: kk */
    public C13631kk m62945kk() {
        return (C13631kk) this.f45304k4.get_Item(m62940to());
    }

    /* JADX INFO: renamed from: k4 */
    public C13631kk m62943k4(int i) {
        return (C13631kk) this.f45304k4.get_Item(i);
    }

    /* JADX INFO: renamed from: x1 */
    public void m62946x1() {
        Iterator<C13631kk> it = iterator();
        while (it.hasNext()) {
            it.next().m62930k4().mo11973c5();
        }
        this.f45304k4.clear();
    }

    /* JADX INFO: renamed from: k4 */
    public void m62944k4(C13631kk c13631kk) {
        this.f45304k4.addItem(c13631kk);
    }
}
