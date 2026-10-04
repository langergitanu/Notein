package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.Queue;
import com.aspose.slides.Collections.Stack;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.UpaException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14046bv;
import com.aspose.slides.p559ms.System.Xml.C13890ei;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.nh */
/* JADX INFO: loaded from: classes5.dex */
public final class C13123nh extends C13192rv {

    /* JADX INFO: renamed from: c5 */
    private boolean f44138c5;

    /* JADX INFO: renamed from: ck */
    private boolean f44139ck;

    /* JADX INFO: renamed from: du */
    private C12930cj f44140du;

    /* JADX INFO: renamed from: dy */
    private AbstractC12998ga f44141dy;

    /* JADX INFO: renamed from: h4 */
    private C12979f7 f44142h4;

    /* JADX INFO: renamed from: jd */
    private int f44143jd;

    /* JADX INFO: renamed from: m9 */
    private Stack f44144m9;

    public C13123nh(int i) {
        this(i, true);
    }

    /* JADX INFO: renamed from: k4 */
    private C13047jd m61231k4(C13047jd c13047jd, C13047jd c13047jd2, C13047jd[] c13047jdArr) {
        if (c13047jd.m61002kk(c13047jd2)) {
            C13047jd c13047jd3 = new C13047jd(this.f44142h4.m60614k4());
            c13047jd3.m61007x1(c13047jd);
            c13047jd3.m60998k4(c13047jd2);
            c13047jd = c13047jd.m61000kk();
            for (int iM61003to = c13047jd3.m61003to(-1); iM61003to != -1; iM61003to = c13047jd3.m61003to(iM61003to)) {
                c13047jd.m61007x1(c13047jdArr[((C12893af) C7019kk.m27452k4(this.f44142h4.m60616k4(iM61003to).f43530x1, C12893af.class)).m61453x1()]);
            }
        }
        return c13047jd;
    }

    /* JADX INFO: renamed from: c5 */
    public final void m61239c5() {
        AbstractC12998ga abstractC12998ga = (AbstractC12998ga) this.f44144m9.pop();
        C13053jm c13053jm = new C13053jm();
        c13053jm.m61639k4(abstractC12998ga);
        this.f44144m9.push(c13053jm);
    }

    /* JADX INFO: renamed from: ck */
    public final void m61240ck() {
        m61235k4((AbstractC13255vt) new C13135o9());
    }

    /* JADX INFO: renamed from: du */
    public final void m61241du() {
        this.f44140du = new C12930cj();
        this.f44142h4 = new C12979f7();
        this.f44144m9 = new Stack();
    }

    /* JADX INFO: renamed from: dy */
    public final void m61242dy() {
        AbstractC12998ga abstractC12998ga = (AbstractC12998ga) this.f44144m9.pop();
        C12981fa c12981fa = new C12981fa();
        c12981fa.m61639k4(abstractC12998ga);
        this.f44144m9.push(c12981fa);
    }

    /* JADX INFO: renamed from: fa */
    public final void m61243fa() {
        m61235k4((AbstractC13255vt) new C12955dw());
    }

    /* JADX INFO: renamed from: h4 */
    public final void m61244h4() {
        this.f44144m9.push(null);
    }

    /* JADX INFO: renamed from: jd */
    public final void m61245jd() {
        m61235k4((AbstractC13255vt) new C12952dt());
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: m9 */
    public final void m61250m9() {
        Object obj;
        AbstractC12998ga abstractC12998ga = (AbstractC12998ga) this.f44144m9.pop();
        if (abstractC12998ga == null) {
            return;
        }
        if (this.f44144m9.size() == 0) {
            this.f44141dy = abstractC12998ga;
            this.f44138c5 = false;
            return;
        }
        AbstractC13255vt abstractC13255vt = (AbstractC13255vt) this.f44144m9.pop();
        if (abstractC13255vt != null) {
            abstractC13255vt.m61642x1(abstractC12998ga);
            this.f44138c5 = true;
            obj = abstractC13255vt;
        } else {
            this.f44138c5 = false;
            obj = abstractC12998ga;
        }
        this.f44144m9.push(obj);
    }

    /* JADX INFO: renamed from: x1 */
    public final C13192rv m61251x1(boolean z) {
        if (this.f44141dy == null) {
            if (m61460x1() != 3) {
                return C13192rv.f44272k4;
            }
            m61459to();
            return m61459to() ? C13192rv.f44274to : C13192rv.f44275x1;
        }
        AbstractC13255vt c13053jm = new C13053jm();
        c13053jm.m61639k4(this.f44141dy);
        int[][] iArrM61237k4 = null;
        C13188rq c13188rq = new C13188rq(this.f44142h4.m60615k4(this.f44140du.m60136k4(C13890ei.f46456k4, (Object) null), null));
        c13053jm.m61642x1(c13188rq);
        this.f44141dy.mo60040k4(c13053jm, this.f44140du, this.f44142h4);
        this.f44140du.m60134k4();
        int iM60614k4 = this.f44142h4.m60614k4();
        C13047jd c13047jd = new C13047jd(iM60614k4);
        C13047jd c13047jd2 = new C13047jd(iM60614k4);
        C13047jd[] c13047jdArr = new C13047jd[iM60614k4];
        for (int i = 0; i < iM60614k4; i++) {
            c13047jdArr[i] = new C13047jd(iM60614k4);
        }
        c13053jm.mo60125k4(c13047jd, c13047jd2, c13047jdArr);
        if (this.f44143jd <= 0) {
            if (this.f44140du.m60142x1()) {
                if (z) {
                    iArrM61237k4 = m61237k4(c13047jd, c13047jdArr, c13188rq.m61453x1());
                }
            } else if (this.f44139ck) {
                m61234k4(c13047jd, c13047jdArr);
            }
            int[][] iArr = iArrM61237k4;
            return iArr != null ? new C13112my(iArr, this.f44140du, m61460x1(), m61459to(), c13053jm.m61641x1().mo60126k4()) : new C12901av(c13047jd, c13047jdArr, this.f44140du, this.f44142h4, c13188rq.m61453x1(), m61460x1(), m61459to(), c13053jm.m61641x1().mo60126k4());
        }
        C13047jd[] c13047jdArr2 = {null};
        C13047jd[] c13047jdArrM61236k4 = m61236k4(c13047jd, c13047jdArr, c13047jdArr2);
        C13047jd c13047jd3 = c13047jdArr2[0];
        if (this.f44139ck) {
            m61233k4(m61231k4(c13047jd, c13047jd3, c13047jdArrM61236k4));
            for (int i2 = 0; i2 < iM60614k4; i2++) {
                m61233k4(m61231k4(c13047jdArr[i2], c13047jd3, c13047jdArrM61236k4));
            }
        }
        return new C13219tl(c13047jd, c13047jdArr, this.f44140du, this.f44142h4, c13188rq.m61453x1(), m61460x1(), c13053jm.m61641x1().mo60126k4(), c13047jd3, this.f44143jd);
    }

    public C13123nh(int i, boolean z) {
        super(i);
        this.f44139ck = z;
    }

    /* JADX INFO: renamed from: x1 */
    private void m61238x1(C13047jd c13047jd) {
        Object[] objArr = new Object[this.f44140du.m60134k4()];
        int iM61003to = c13047jd.m61003to(-1);
        while (iM61003to != -1) {
            int i = this.f44142h4.m60616k4(iM61003to).f43529k4;
            Object obj = objArr[i];
            if (obj == null) {
                objArr[i] = this.f44142h4.m60616k4(iM61003to).f43530x1;
            } else if (obj != this.f44142h4.m60616k4(iM61003to).f43530x1) {
                throw new UpaException(objArr[i], this.f44142h4.m60616k4(iM61003to).f43530x1);
            }
            iM61003to = c13047jd.m61003to(iM61003to);
        }
    }

    @Override // com.aspose.slides.internal.p532yu.C13192rv
    /* JADX INFO: renamed from: k4 */
    public Object mo60051k4(C13890ei c13890ei, C13190rs c13190rs, int[] iArr) {
        throw new InvalidOperationException();
    }

    /* JADX INFO: renamed from: k4 */
    private void m61232k4(AbstractC12998ga abstractC12998ga) {
        AbstractC13255vt abstractC13255vt;
        if (this.f44144m9.size() > 0 && (abstractC13255vt = (AbstractC13255vt) this.f44144m9.pop()) != null) {
            abstractC13255vt.m61642x1(abstractC12998ga);
            abstractC12998ga = abstractC13255vt;
        }
        this.f44144m9.push(abstractC12998ga);
        this.f44138c5 = true;
    }

    @Override // com.aspose.slides.internal.p532yu.C13192rv
    /* JADX INFO: renamed from: x1 */
    public boolean mo60053x1(C13190rs c13190rs) {
        throw new InvalidOperationException();
    }

    /* JADX INFO: renamed from: k4 */
    private void m61233k4(C13047jd c13047jd) {
        Object[] objArr = new Object[this.f44140du.m60134k4()];
        int iM61003to = c13047jd.m61003to(-1);
        while (iM61003to != -1) {
            C12948dl c12948dlClone = this.f44142h4.m60616k4(iM61003to).Clone();
            int i = c12948dlClone.f43529k4;
            if (i >= 0) {
                if (objArr[i] != null) {
                    throw new UpaException(objArr[i], c12948dlClone.f43530x1);
                }
                objArr[i] = c12948dlClone.f43530x1;
            }
            iM61003to = c13047jd.m61003to(iM61003to);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m61234k4(C13047jd c13047jd, C13047jd[] c13047jdArr) {
        m61238x1(c13047jd);
        for (int i = 0; i < this.f44142h4.m60614k4(); i++) {
            m61238x1(c13047jdArr[i]);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61246k4(C13086lm c13086lm, Object obj) {
        this.f44140du.m60139k4(c13086lm, obj, false);
        m61232k4(new C12923c4(c13086lm, obj));
    }

    @Override // com.aspose.slides.internal.p532yu.C13192rv
    /* JADX INFO: renamed from: k4 */
    public void mo60052k4(C13190rs c13190rs) {
        throw new InvalidOperationException();
    }

    /* JADX INFO: renamed from: k4 */
    private void m61235k4(AbstractC13255vt abstractC13255vt) {
        if (this.f44144m9.size() <= 0) {
            AbstractC12998ga abstractC12998ga = this.f44141dy;
            if (abstractC12998ga != null) {
                abstractC13255vt.m61639k4(abstractC12998ga);
                this.f44141dy = abstractC13255vt;
                return;
            }
            return;
        }
        AbstractC12998ga abstractC12998ga2 = (AbstractC12998ga) this.f44144m9.pop();
        AbstractC13255vt abstractC13255vt2 = (AbstractC13255vt) C7019kk.m27452k4((Object) abstractC12998ga2, AbstractC13255vt.class);
        if (!this.f44138c5 || abstractC13255vt2 == null) {
            abstractC13255vt.m61639k4(abstractC12998ga2);
        } else {
            abstractC13255vt.m61639k4(abstractC13255vt2.m61640kk());
            abstractC13255vt2.m61642x1(abstractC13255vt);
            abstractC13255vt = abstractC12998ga2;
        }
        this.f44144m9.push(abstractC13255vt);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61247k4(C13890ei c13890ei, Object obj) {
        m61232k4(new C13188rq(this.f44142h4.m60615k4(this.f44140du.m60136k4(c13890ei, obj), obj)));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61248k4(C14046bv c14046bv, C14046bv c14046bv2) {
        C12893af c12893af = new C12893af(c14046bv.Clone(), c14046bv2.Clone());
        c12893af.m61452k4(this.f44142h4.m60615k4(-2, c12893af));
        AbstractC13255vt c13053jm = new C13053jm();
        c13053jm.m61642x1(c12893af);
        m61235k4(c13053jm);
        this.f44143jd++;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m61249k4(C13890ei c13890ei) {
        return this.f44140du.m60143x1(c13890ei);
    }

    /* JADX INFO: renamed from: k4 */
    private C13047jd[] m61236k4(C13047jd c13047jd, C13047jd[] c13047jdArr, C13047jd[] c13047jdArr2) {
        int iM60614k4 = this.f44142h4.m60614k4();
        c13047jdArr2[0] = new C13047jd(iM60614k4);
        C13047jd[] c13047jdArr3 = new C13047jd[this.f44143jd];
        int i = 0;
        for (int i2 = iM60614k4 - 1; i2 >= 0; i2--) {
            C12948dl c12948dlClone = this.f44142h4.m60616k4(i2).Clone();
            if (c12948dlClone.f43529k4 == -2) {
                C12893af c12893af = (C12893af) C7019kk.m27452k4(c12948dlClone.f43530x1, C12893af.class);
                C13047jd c13047jd2 = new C13047jd(iM60614k4);
                c13047jd2.m61005x1();
                c13047jd2.m61007x1(c13047jdArr[i2]);
                if (C14046bv.m66484m9(c12893af.m60042to(), c12893af.m60041kk())) {
                    c13047jd2.m61007x1(c12893af.m60037du());
                }
                for (int iM61003to = c13047jd2.m61003to(-1); iM61003to != -1; iM61003to = c13047jd2.m61003to(iM61003to)) {
                    if (iM61003to > i2) {
                        C12948dl c12948dlClone2 = this.f44142h4.m60616k4(iM61003to).Clone();
                        if (c12948dlClone2.f43529k4 == -2) {
                            c13047jd2.m61007x1(c13047jdArr3[((C12893af) C7019kk.m27452k4(c12948dlClone2.f43530x1, C12893af.class)).m61453x1()]);
                        }
                    }
                }
                c13047jdArr3[i] = c13047jd2;
                c12893af.m61452k4(i);
                c13047jdArr2[0].m61006x1(i2);
                i++;
            }
        }
        return c13047jdArr3;
    }

    /* JADX INFO: renamed from: k4 */
    private int[][] m61237k4(C13047jd c13047jd, C13047jd[] c13047jdArr, int i) {
        int iM60614k4 = this.f44142h4.m60614k4();
        int i2 = 8192 / iM60614k4;
        int iM60134k4 = this.f44140du.m60134k4();
        ArrayList arrayList = new ArrayList();
        Hashtable hashtable = new Hashtable();
        int i3 = -1;
        hashtable.addItem(new C13047jd(iM60614k4), -1);
        Queue queue = new Queue();
        queue.enqueue(c13047jd);
        int i4 = 0;
        hashtable.addItem(c13047jd, 0);
        int i5 = iM60134k4 + 1;
        arrayList.addItem(new int[i5]);
        int i6 = 0;
        while (queue.size() > 0) {
            C13047jd c13047jd2 = (C13047jd) queue.dequeue();
            int[] iArr = (int[]) C7019kk.m27458kk(arrayList.get_Item(i6), int[].class);
            boolean z = true;
            if (c13047jd2.m60999k4(i)) {
                iArr[iM60134k4] = 1;
            }
            int i7 = i4;
            while (i7 < iM60134k4) {
                C13047jd c13047jd3 = new C13047jd(iM60614k4);
                boolean z2 = z;
                int iM61003to = c13047jd2.m61003to(i3);
                while (iM61003to != i3) {
                    if (i7 == this.f44142h4.m60616k4(iM61003to).f43529k4) {
                        c13047jd3.m61007x1(c13047jdArr[iM61003to]);
                    }
                    iM61003to = c13047jd2.m61003to(iM61003to);
                    i3 = -1;
                }
                Object obj = hashtable.get_Item(c13047jd3);
                if (obj != null) {
                    iArr[i7] = ((Integer) C7019kk.m27464to(obj, Integer.TYPE)).intValue();
                } else {
                    int size = hashtable.size() - 1;
                    if (size >= i2) {
                        return null;
                    }
                    queue.enqueue(c13047jd3);
                    hashtable.addItem(c13047jd3, Integer.valueOf(size));
                    arrayList.addItem(new int[i5]);
                    iArr[i7] = size;
                }
                i7++;
                z = z2;
                i3 = -1;
            }
            i6++;
            i3 = -1;
            i4 = 0;
        }
        return (int[][]) C7019kk.m27458kk(arrayList.toArray(C7019kk.m27443k4((Class<?>) int[].class)), int[][].class);
    }
}
