package androidx.recyclerview.widget;

import androidx.core.util.Pools;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final RecyclerView.OooO0o f65794OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Pools.SimplePool f65791OooO00o = new Pools.SimplePool(30);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList<C19033OooO00o> f65792OooO0O0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList<C19033OooO00o> f65793OooO0OO = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f65795OooO0o = 0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C22052OooOoO0 f65796OooO0o0 = new C22052OooOoO0(this);

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19033OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f65797OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f65798OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Object f65799OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f65800OooO0Oo;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (!(obj instanceof C19033OooO00o)) {
                    return false;
                }
                C19033OooO00o c19033OooO00o = (C19033OooO00o) obj;
                int i = this.f65797OooO00o;
                if (i != c19033OooO00o.f65797OooO00o) {
                    return false;
                }
                if (i != 8 || Math.abs(this.f65800OooO0Oo - this.f65798OooO0O0) != 1 || this.f65800OooO0Oo != c19033OooO00o.f65798OooO0O0 || this.f65798OooO0O0 != c19033OooO00o.f65800OooO0Oo) {
                    if (this.f65800OooO0Oo != c19033OooO00o.f65800OooO0Oo || this.f65798OooO0O0 != c19033OooO00o.f65798OooO0O0) {
                        return false;
                    }
                    Object obj2 = this.f65799OooO0OO;
                    if (obj2 != null) {
                        if (!obj2.equals(c19033OooO00o.f65799OooO0OO)) {
                            return false;
                        }
                    } else if (c19033OooO00o.f65799OooO0OO != null) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            return (((this.f65797OooO00o * 31) + this.f65798OooO0O0) * 31) + this.f65800OooO0Oo;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.f65797OooO00o;
            sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
            sb.append(",s:");
            sb.append(this.f65798OooO0O0);
            sb.append("c:");
            sb.append(this.f65800OooO0Oo);
            sb.append(",p:");
            return androidx.concurrent.futures.OooO0o.OooO0O0(sb, this.f65799OooO0OO, "]");
        }
    }

    public OooO00o(RecyclerView.OooO0o oooO0o) {
        this.f65794OooO0Oo = oooO0o;
    }

    public final void OooO(C19033OooO00o c19033OooO00o) {
        this.f65793OooO0OO.add(c19033OooO00o);
        int i = c19033OooO00o.f65797OooO00o;
        RecyclerView.OooO0o oooO0o = this.f65794OooO0Oo;
        if (i == 1) {
            int i2 = c19033OooO00o.f65798OooO0O0;
            int i3 = c19033OooO00o.f65800OooO0Oo;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.offsetPositionRecordsForInsert(i2, i3);
            recyclerView.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 2) {
            int i4 = c19033OooO00o.f65798OooO0O0;
            int i5 = c19033OooO00o.f65800OooO0Oo;
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.offsetPositionRecordsForRemove(i4, i5, false);
            recyclerView2.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 4) {
            int i6 = c19033OooO00o.f65798OooO0O0;
            int i7 = c19033OooO00o.f65800OooO0Oo;
            Object obj = c19033OooO00o.f65799OooO0OO;
            RecyclerView recyclerView3 = RecyclerView.this;
            recyclerView3.viewRangeUpdate(i6, i7, obj);
            recyclerView3.mItemsChanged = true;
            return;
        }
        if (i != 8) {
            throw new IllegalArgumentException("Unknown update op type for " + c19033OooO00o);
        }
        int i8 = c19033OooO00o.f65798OooO0O0;
        int i9 = c19033OooO00o.f65800OooO0Oo;
        RecyclerView recyclerView4 = RecyclerView.this;
        recyclerView4.offsetPositionRecordsForMove(i8, i9);
        recyclerView4.mItemsAddedOrRemoved = true;
    }

    public final boolean OooO00o(int i) {
        ArrayList<C19033OooO00o> arrayList = this.f65793OooO0OO;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C19033OooO00o c19033OooO00o = arrayList.get(i2);
            int i3 = c19033OooO00o.f65797OooO00o;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = c19033OooO00o.f65798OooO0O0;
                    int i5 = c19033OooO00o.f65800OooO0Oo + i4;
                    while (i4 < i5) {
                        if (OooO0o(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (OooO0o(c19033OooO00o.f65800OooO0Oo, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void OooO0O0() {
        ArrayList<C19033OooO00o> arrayList = this.f65793OooO0OO;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f65794OooO0Oo.OooO00o(arrayList.get(i));
        }
        OooOO0O(arrayList);
        this.f65795OooO0o = 0;
    }

    public final void OooO0OO() {
        OooO0O0();
        ArrayList<C19033OooO00o> arrayList = this.f65792OooO0O0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C19033OooO00o c19033OooO00o = arrayList.get(i);
            int i2 = c19033OooO00o.f65797OooO00o;
            RecyclerView.OooO0o oooO0o = this.f65794OooO0Oo;
            if (i2 == 1) {
                oooO0o.OooO00o(c19033OooO00o);
                int i3 = c19033OooO00o.f65798OooO0O0;
                int i4 = c19033OooO00o.f65800OooO0Oo;
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.offsetPositionRecordsForInsert(i3, i4);
                recyclerView.mItemsAddedOrRemoved = true;
            } else if (i2 == 2) {
                oooO0o.OooO00o(c19033OooO00o);
                int i5 = c19033OooO00o.f65798OooO0O0;
                int i6 = c19033OooO00o.f65800OooO0Oo;
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.offsetPositionRecordsForRemove(i5, i6, true);
                recyclerView2.mItemsAddedOrRemoved = true;
                recyclerView2.mState.f66096OooO0OO += i6;
            } else if (i2 == 4) {
                oooO0o.OooO00o(c19033OooO00o);
                int i7 = c19033OooO00o.f65798OooO0O0;
                int i8 = c19033OooO00o.f65800OooO0Oo;
                Object obj = c19033OooO00o.f65799OooO0OO;
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.viewRangeUpdate(i7, i8, obj);
                recyclerView3.mItemsChanged = true;
            } else if (i2 == 8) {
                oooO0o.OooO00o(c19033OooO00o);
                int i9 = c19033OooO00o.f65798OooO0O0;
                int i10 = c19033OooO00o.f65800OooO0Oo;
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.offsetPositionRecordsForMove(i9, i10);
                recyclerView4.mItemsAddedOrRemoved = true;
            }
        }
        OooOO0O(arrayList);
        this.f65795OooO0o = 0;
    }

    public final void OooO0Oo(C19033OooO00o c19033OooO00o) {
        int i;
        Pools.SimplePool simplePool;
        int i2 = c19033OooO00o.f65797OooO00o;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iOooOO0o = OooOO0o(c19033OooO00o.f65798OooO0O0, i2);
        int i3 = c19033OooO00o.f65798OooO0O0;
        int i4 = c19033OooO00o.f65797OooO00o;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c19033OooO00o);
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = c19033OooO00o.f65800OooO0Oo;
            simplePool = this.f65791OooO00o;
            if (i5 >= i7) {
                break;
            }
            int iOooOO0o2 = OooOO0o((i * i5) + c19033OooO00o.f65798OooO0O0, c19033OooO00o.f65797OooO00o);
            int i8 = c19033OooO00o.f65797OooO00o;
            if (i8 == 2 ? iOooOO0o2 != iOooOO0o : !(i8 == 4 && iOooOO0o2 == iOooOO0o + 1)) {
                C19033OooO00o c19033OooO00oOooO0oo = OooO0oo(i8, iOooOO0o, i6, c19033OooO00o.f65799OooO0OO);
                OooO0o0(c19033OooO00oOooO0oo, i3);
                c19033OooO00oOooO0oo.f65799OooO0OO = null;
                simplePool.release(c19033OooO00oOooO0oo);
                if (c19033OooO00o.f65797OooO00o == 4) {
                    i3 += i6;
                }
                i6 = 1;
                iOooOO0o = iOooOO0o2;
            } else {
                i6++;
            }
            i5++;
        }
        Object obj = c19033OooO00o.f65799OooO0OO;
        c19033OooO00o.f65799OooO0OO = null;
        simplePool.release(c19033OooO00o);
        if (i6 > 0) {
            C19033OooO00o c19033OooO00oOooO0oo2 = OooO0oo(c19033OooO00o.f65797OooO00o, iOooOO0o, i6, obj);
            OooO0o0(c19033OooO00oOooO0oo2, i3);
            c19033OooO00oOooO0oo2.f65799OooO0OO = null;
            simplePool.release(c19033OooO00oOooO0oo2);
        }
    }

    public final int OooO0o(int i, int i2) {
        ArrayList<C19033OooO00o> arrayList = this.f65793OooO0OO;
        int size = arrayList.size();
        while (i2 < size) {
            C19033OooO00o c19033OooO00o = arrayList.get(i2);
            int i3 = c19033OooO00o.f65797OooO00o;
            if (i3 == 8) {
                int i4 = c19033OooO00o.f65798OooO0O0;
                if (i4 == i) {
                    i = c19033OooO00o.f65800OooO0Oo;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c19033OooO00o.f65800OooO0Oo <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c19033OooO00o.f65798OooO0O0;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c19033OooO00o.f65800OooO0Oo;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c19033OooO00o.f65800OooO0Oo;
                }
            }
            i2++;
        }
        return i;
    }

    public final void OooO0o0(C19033OooO00o c19033OooO00o, int i) {
        RecyclerView.OooO0o oooO0o = this.f65794OooO0Oo;
        oooO0o.OooO00o(c19033OooO00o);
        int i2 = c19033OooO00o.f65797OooO00o;
        if (i2 == 2) {
            int i3 = c19033OooO00o.f65800OooO0Oo;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.offsetPositionRecordsForRemove(i, i3, true);
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f66096OooO0OO += i3;
            return;
        }
        if (i2 != 4) {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i4 = c19033OooO00o.f65800OooO0Oo;
        Object obj = c19033OooO00o.f65799OooO0OO;
        RecyclerView recyclerView2 = RecyclerView.this;
        recyclerView2.viewRangeUpdate(i, i4, obj);
        recyclerView2.mItemsChanged = true;
    }

    public final boolean OooO0oO() {
        return this.f65792OooO0O0.size() > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C19033OooO00o OooO0oo(int i, int i2, int i3, Object obj) {
        C19033OooO00o c19033OooO00o = (C19033OooO00o) this.f65791OooO00o.acquire();
        if (c19033OooO00o != null) {
            c19033OooO00o.f65797OooO00o = i;
            c19033OooO00o.f65798OooO0O0 = i2;
            c19033OooO00o.f65800OooO0Oo = i3;
            c19033OooO00o.f65799OooO0OO = obj;
            return c19033OooO00o;
        }
        C19033OooO00o c19033OooO00o2 = new C19033OooO00o();
        c19033OooO00o2.f65797OooO00o = i;
        c19033OooO00o2.f65798OooO0O0 = i2;
        c19033OooO00o2.f65800OooO0Oo = i3;
        c19033OooO00o2.f65799OooO0OO = obj;
        return c19033OooO00o2;
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x009f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooOO0() {
        byte b;
        int i;
        Object obj;
        int i2;
        int i3;
        Object obj2;
        int i4;
        boolean z;
        byte b2;
        C19033OooO00o c19033OooO00oOooO0oo;
        int i5;
        int i6;
        C19033OooO00o c19033OooO00oOooO0oo2;
        boolean z2;
        boolean z3;
        C19033OooO00o c19033OooO00oOooO0oo3;
        ArrayList<C19033OooO00o> arrayList = this.f65792OooO0O0;
        C22052OooOoO0 c22052OooOoO0 = this.f65796OooO0o0;
        c22052OooOoO0.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                b = -1;
                i = 8;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (arrayList.get(size).f65797OooO00o != 8) {
                    z4 = true;
                } else if (z4) {
                    break;
                }
                size--;
            }
            obj = null;
            i2 = 4;
            i3 = 2;
            if (size == -1) {
                break;
            }
            int i7 = size + 1;
            C19033OooO00o c19033OooO00o = arrayList.get(size);
            C19033OooO00o c19033OooO00o2 = arrayList.get(i7);
            int i8 = c19033OooO00o2.f65797OooO00o;
            if (i8 != 1) {
                OooO00o oooO00o = c22052OooOoO0.f66023OooO00o;
                if (i8 == 2) {
                    int i9 = c19033OooO00o.f65798OooO0O0;
                    int i10 = c19033OooO00o.f65800OooO0Oo;
                    if (i9 < i10) {
                        z3 = c19033OooO00o2.f65798OooO0O0 == i9 && c19033OooO00o2.f65800OooO0Oo == i10 - i9;
                        z2 = false;
                    } else if (c19033OooO00o2.f65798OooO0O0 == i10 + 1 && c19033OooO00o2.f65800OooO0Oo == i9 - i10) {
                        z3 = true;
                        z2 = true;
                    } else {
                        z2 = true;
                        z3 = false;
                    }
                    int i11 = c19033OooO00o2.f65798OooO0O0;
                    if (i10 < i11) {
                        c19033OooO00o2.f65798OooO0O0 = i11 - 1;
                    } else {
                        int i12 = c19033OooO00o2.f65800OooO0Oo;
                        if (i10 < i11 + i12) {
                            c19033OooO00o2.f65800OooO0Oo = i12 - 1;
                            c19033OooO00o.f65797OooO00o = 2;
                            c19033OooO00o.f65800OooO0Oo = 1;
                            if (c19033OooO00o2.f65800OooO0Oo == 0) {
                                arrayList.remove(i7);
                                c19033OooO00o2.f65799OooO0OO = null;
                                oooO00o.f65791OooO00o.release(c19033OooO00o2);
                            }
                        }
                    }
                    int i13 = c19033OooO00o.f65798OooO0O0;
                    int i14 = c19033OooO00o2.f65798OooO0O0;
                    if (i13 <= i14) {
                        c19033OooO00o2.f65798OooO0O0 = i14 + 1;
                    } else {
                        int i15 = i14 + c19033OooO00o2.f65800OooO0Oo;
                        if (i13 < i15) {
                            c19033OooO00oOooO0oo3 = oooO00o.OooO0oo(2, i13 + 1, i15 - i13, null);
                            c19033OooO00o2.f65800OooO0Oo = c19033OooO00o.f65798OooO0O0 - c19033OooO00o2.f65798OooO0O0;
                        }
                        if (z3) {
                            if (z2) {
                                if (c19033OooO00oOooO0oo3 != null) {
                                    int i16 = c19033OooO00o.f65798OooO0O0;
                                    if (i16 > c19033OooO00oOooO0oo3.f65798OooO0O0) {
                                        c19033OooO00o.f65798OooO0O0 = i16 - c19033OooO00oOooO0oo3.f65800OooO0Oo;
                                    }
                                    int i17 = c19033OooO00o.f65800OooO0Oo;
                                    if (i17 > c19033OooO00oOooO0oo3.f65798OooO0O0) {
                                        c19033OooO00o.f65800OooO0Oo = i17 - c19033OooO00oOooO0oo3.f65800OooO0Oo;
                                    }
                                }
                                int i18 = c19033OooO00o.f65798OooO0O0;
                                if (i18 > c19033OooO00o2.f65798OooO0O0) {
                                    c19033OooO00o.f65798OooO0O0 = i18 - c19033OooO00o2.f65800OooO0Oo;
                                }
                                int i19 = c19033OooO00o.f65800OooO0Oo;
                                if (i19 > c19033OooO00o2.f65798OooO0O0) {
                                    c19033OooO00o.f65800OooO0Oo = i19 - c19033OooO00o2.f65800OooO0Oo;
                                }
                            } else {
                                if (c19033OooO00oOooO0oo3 != null) {
                                    int i20 = c19033OooO00o.f65798OooO0O0;
                                    if (i20 >= c19033OooO00oOooO0oo3.f65798OooO0O0) {
                                        c19033OooO00o.f65798OooO0O0 = i20 - c19033OooO00oOooO0oo3.f65800OooO0Oo;
                                    }
                                    int i21 = c19033OooO00o.f65800OooO0Oo;
                                    if (i21 >= c19033OooO00oOooO0oo3.f65798OooO0O0) {
                                        c19033OooO00o.f65800OooO0Oo = i21 - c19033OooO00oOooO0oo3.f65800OooO0Oo;
                                    }
                                }
                                int i22 = c19033OooO00o.f65798OooO0O0;
                                if (i22 >= c19033OooO00o2.f65798OooO0O0) {
                                    c19033OooO00o.f65798OooO0O0 = i22 - c19033OooO00o2.f65800OooO0Oo;
                                }
                                int i23 = c19033OooO00o.f65800OooO0Oo;
                                if (i23 >= c19033OooO00o2.f65798OooO0O0) {
                                    c19033OooO00o.f65800OooO0Oo = i23 - c19033OooO00o2.f65800OooO0Oo;
                                }
                            }
                            arrayList.set(size, c19033OooO00o2);
                            if (c19033OooO00o.f65798OooO0O0 != c19033OooO00o.f65800OooO0Oo) {
                                arrayList.set(i7, c19033OooO00o);
                            } else {
                                arrayList.remove(i7);
                            }
                            if (c19033OooO00oOooO0oo3 != null) {
                                arrayList.add(size, c19033OooO00oOooO0oo3);
                            }
                        } else {
                            arrayList.set(size, c19033OooO00o2);
                            arrayList.remove(i7);
                            c19033OooO00o.f65799OooO0OO = null;
                            oooO00o.f65791OooO00o.release(c19033OooO00o);
                        }
                    }
                    c19033OooO00oOooO0oo3 = null;
                    if (z3) {
                    }
                } else if (i8 == 4) {
                    int i24 = c19033OooO00o.f65800OooO0Oo;
                    int i25 = c19033OooO00o2.f65798OooO0O0;
                    if (i24 < i25) {
                        c19033OooO00o2.f65798OooO0O0 = i25 - 1;
                    } else {
                        int i26 = c19033OooO00o2.f65800OooO0Oo;
                        if (i24 < i25 + i26) {
                            c19033OooO00o2.f65800OooO0Oo = i26 - 1;
                            c19033OooO00oOooO0oo = oooO00o.OooO0oo(4, c19033OooO00o.f65798OooO0O0, 1, c19033OooO00o2.f65799OooO0OO);
                        }
                        i5 = c19033OooO00o.f65798OooO0O0;
                        i6 = c19033OooO00o2.f65798OooO0O0;
                        if (i5 > i6) {
                            c19033OooO00o2.f65798OooO0O0 = i6 + 1;
                        } else {
                            int i27 = i6 + c19033OooO00o2.f65800OooO0Oo;
                            if (i5 < i27) {
                                int i28 = i27 - i5;
                                c19033OooO00oOooO0oo2 = oooO00o.OooO0oo(4, i5 + 1, i28, c19033OooO00o2.f65799OooO0OO);
                                c19033OooO00o2.f65800OooO0Oo -= i28;
                            }
                            arrayList.set(i7, c19033OooO00o);
                            if (c19033OooO00o2.f65800OooO0Oo > 0) {
                                arrayList.set(size, c19033OooO00o2);
                            } else {
                                arrayList.remove(size);
                                c19033OooO00o2.f65799OooO0OO = null;
                                oooO00o.f65791OooO00o.release(c19033OooO00o2);
                            }
                            if (c19033OooO00oOooO0oo != null) {
                                arrayList.add(size, c19033OooO00oOooO0oo);
                            }
                            if (c19033OooO00oOooO0oo2 != null) {
                                arrayList.add(size, c19033OooO00oOooO0oo2);
                            }
                        }
                        c19033OooO00oOooO0oo2 = null;
                        arrayList.set(i7, c19033OooO00o);
                        if (c19033OooO00o2.f65800OooO0Oo > 0) {
                        }
                        if (c19033OooO00oOooO0oo != null) {
                        }
                        if (c19033OooO00oOooO0oo2 != null) {
                        }
                    }
                    c19033OooO00oOooO0oo = null;
                    i5 = c19033OooO00o.f65798OooO0O0;
                    i6 = c19033OooO00o2.f65798OooO0O0;
                    if (i5 > i6) {
                    }
                    c19033OooO00oOooO0oo2 = null;
                    arrayList.set(i7, c19033OooO00o);
                    if (c19033OooO00o2.f65800OooO0Oo > 0) {
                    }
                    if (c19033OooO00oOooO0oo != null) {
                    }
                    if (c19033OooO00oOooO0oo2 != null) {
                    }
                }
            } else {
                int i29 = c19033OooO00o.f65800OooO0Oo;
                int i30 = c19033OooO00o2.f65798OooO0O0;
                int i31 = i29 < i30 ? -1 : 0;
                int i32 = c19033OooO00o.f65798OooO0O0;
                if (i32 < i30) {
                    i31++;
                }
                if (i30 <= i32) {
                    c19033OooO00o.f65798OooO0O0 = i32 + c19033OooO00o2.f65800OooO0Oo;
                }
                int i33 = c19033OooO00o2.f65798OooO0O0;
                if (i33 <= i29) {
                    c19033OooO00o.f65800OooO0Oo = i29 + c19033OooO00o2.f65800OooO0Oo;
                }
                c19033OooO00o2.f65798OooO0O0 = i33 + i31;
                arrayList.set(size, c19033OooO00o2);
                arrayList.set(i7, c19033OooO00o);
            }
        }
        int size2 = arrayList.size();
        int i34 = 0;
        while (i34 < size2) {
            C19033OooO00o c19033OooO00oOooO0oo4 = arrayList.get(i34);
            int i35 = c19033OooO00oOooO0oo4.f65797OooO00o;
            if (i35 != 1) {
                Pools.SimplePool simplePool = this.f65791OooO00o;
                RecyclerView.OooO0o oooO0o = this.f65794OooO0Oo;
                if (i35 == i3) {
                    int i36 = c19033OooO00oOooO0oo4.f65798OooO0O0;
                    int i37 = c19033OooO00oOooO0oo4.f65800OooO0Oo + i36;
                    int i38 = i36;
                    int i39 = 0;
                    byte b3 = -1;
                    while (i38 < i37) {
                        RecyclerView recyclerView = RecyclerView.this;
                        RecyclerView.AbstractC22078OooOooO abstractC22078OooOooOFindViewHolderForPosition = recyclerView.findViewHolderForPosition(i38, true);
                        if (abstractC22078OooOooOFindViewHolderForPosition == null) {
                            abstractC22078OooOooOFindViewHolderForPosition = null;
                        } else {
                            if (recyclerView.mChildHelper.f65830OooO0OO.contains(abstractC22078OooOooOFindViewHolderForPosition.itemView)) {
                            }
                        }
                        if (abstractC22078OooOooOFindViewHolderForPosition != null || OooO00o(i38)) {
                            if (b3 == 0) {
                                OooO0Oo(OooO0oo(2, i36, i39, null));
                                z = true;
                            } else {
                                z = false;
                            }
                            b2 = 1;
                        } else {
                            if (b3 == 1) {
                                OooO(OooO0oo(2, i36, i39, null));
                                z = true;
                            } else {
                                z = false;
                            }
                            b2 = 0;
                        }
                        if (z) {
                            i38 -= i39;
                            i37 -= i39;
                            i39 = 1;
                        } else {
                            i39++;
                        }
                        i38++;
                        b3 = b2;
                    }
                    obj2 = null;
                    if (i39 != c19033OooO00oOooO0oo4.f65800OooO0Oo) {
                        c19033OooO00oOooO0oo4.f65799OooO0OO = null;
                        simplePool.release(c19033OooO00oOooO0oo4);
                        i4 = 2;
                        c19033OooO00oOooO0oo4 = OooO0oo(2, i36, i39, null);
                    } else {
                        i4 = 2;
                    }
                    if (b3 == 0) {
                        OooO0Oo(c19033OooO00oOooO0oo4);
                    } else {
                        OooO(c19033OooO00oOooO0oo4);
                    }
                } else if (i35 != i2) {
                    if (i35 == i) {
                        OooO(c19033OooO00oOooO0oo4);
                    }
                    obj2 = obj;
                    i4 = i3;
                } else {
                    int i40 = c19033OooO00oOooO0oo4.f65798OooO0O0;
                    int i41 = c19033OooO00oOooO0oo4.f65800OooO0Oo + i40;
                    byte b4 = b;
                    int i42 = i40;
                    int i43 = 0;
                    while (i40 < i41) {
                        RecyclerView recyclerView2 = RecyclerView.this;
                        RecyclerView.AbstractC22078OooOooO abstractC22078OooOooOFindViewHolderForPosition2 = recyclerView2.findViewHolderForPosition(i40, true);
                        if (abstractC22078OooOooOFindViewHolderForPosition2 == null) {
                            abstractC22078OooOooOFindViewHolderForPosition2 = null;
                        } else {
                            if (recyclerView2.mChildHelper.f65830OooO0OO.contains(abstractC22078OooOooOFindViewHolderForPosition2.itemView)) {
                            }
                        }
                        if (abstractC22078OooOooOFindViewHolderForPosition2 != null || OooO00o(i40)) {
                            if (b4 == 0) {
                                OooO0Oo(OooO0oo(4, i42, i43, c19033OooO00oOooO0oo4.f65799OooO0OO));
                                i42 = i40;
                                i43 = 0;
                            }
                            b4 = 1;
                        } else {
                            if (b4 == 1) {
                                OooO(OooO0oo(4, i42, i43, c19033OooO00oOooO0oo4.f65799OooO0OO));
                                i42 = i40;
                                i43 = 0;
                            }
                            b4 = 0;
                        }
                        i43++;
                        i40++;
                    }
                    if (i43 != c19033OooO00oOooO0oo4.f65800OooO0Oo) {
                        Object obj3 = c19033OooO00oOooO0oo4.f65799OooO0OO;
                        c19033OooO00oOooO0oo4.f65799OooO0OO = null;
                        simplePool.release(c19033OooO00oOooO0oo4);
                        c19033OooO00oOooO0oo4 = OooO0oo(4, i42, i43, obj3);
                    }
                    if (b4 == 0) {
                        OooO0Oo(c19033OooO00oOooO0oo4);
                    } else {
                        OooO(c19033OooO00oOooO0oo4);
                    }
                    obj2 = null;
                    i4 = 2;
                }
            } else {
                obj2 = obj;
                i4 = i3;
                OooO(c19033OooO00oOooO0oo4);
            }
            i34++;
            obj = obj2;
            i3 = i4;
            b = -1;
            i = 8;
            i2 = 4;
        }
        arrayList.clear();
    }

    public final void OooOO0O(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C19033OooO00o c19033OooO00o = (C19033OooO00o) arrayList.get(i);
            c19033OooO00o.f65799OooO0OO = null;
            this.f65791OooO00o.release(c19033OooO00o);
        }
        arrayList.clear();
    }

    public final int OooOO0o(int i, int i2) {
        int i3;
        int i4;
        ArrayList<C19033OooO00o> arrayList = this.f65793OooO0OO;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C19033OooO00o c19033OooO00o = arrayList.get(size);
            int i5 = c19033OooO00o.f65797OooO00o;
            if (i5 == 8) {
                int i6 = c19033OooO00o.f65798OooO0O0;
                int i7 = c19033OooO00o.f65800OooO0Oo;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            c19033OooO00o.f65798OooO0O0 = i6 + 1;
                            c19033OooO00o.f65800OooO0Oo = i7 + 1;
                        } else if (i2 == 2) {
                            c19033OooO00o.f65798OooO0O0 = i6 - 1;
                            c19033OooO00o.f65800OooO0Oo = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c19033OooO00o.f65800OooO0Oo = i7 + 1;
                    } else if (i2 == 2) {
                        c19033OooO00o.f65800OooO0Oo = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c19033OooO00o.f65798OooO0O0 = i6 + 1;
                    } else if (i2 == 2) {
                        c19033OooO00o.f65798OooO0O0 = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c19033OooO00o.f65798OooO0O0;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c19033OooO00o.f65800OooO0Oo;
                    } else if (i5 == 2) {
                        i += c19033OooO00o.f65800OooO0Oo;
                    }
                } else if (i2 == 1) {
                    c19033OooO00o.f65798OooO0O0 = i8 + 1;
                } else if (i2 == 2) {
                    c19033OooO00o.f65798OooO0O0 = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C19033OooO00o c19033OooO00o2 = arrayList.get(size2);
            int i9 = c19033OooO00o2.f65797OooO00o;
            Pools.SimplePool simplePool = this.f65791OooO00o;
            if (i9 == 8) {
                int i10 = c19033OooO00o2.f65800OooO0Oo;
                if (i10 == c19033OooO00o2.f65798OooO0O0 || i10 < 0) {
                    arrayList.remove(size2);
                    c19033OooO00o2.f65799OooO0OO = null;
                    simplePool.release(c19033OooO00o2);
                }
            } else if (c19033OooO00o2.f65800OooO0Oo <= 0) {
                arrayList.remove(size2);
                c19033OooO00o2.f65799OooO0OO = null;
                simplePool.release(c19033OooO00o2);
            }
        }
        return i;
    }
}
