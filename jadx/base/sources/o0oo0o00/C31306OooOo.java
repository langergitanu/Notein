package o0oo0o00;

import com.aspose.words.ControlChar;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import o0oo0o0.C31286OooO0O0;
import o0oo0o00.AbstractC31298OooOO0o;

/* JADX INFO: renamed from: o0oo0o00.OooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31306OooOo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final ArrayList f111767OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<AbstractC31298OooOO0o.OooO00o> f111768OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ThreadLocal<OooO0OO> f111769OooO0O0 = new ThreadLocal<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final LinkedHashMap f111770OooO0OO = new LinkedHashMap();

    /* JADX INFO: renamed from: o0oo0o00.OooOo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f111771OooO00o = new ArrayList();
    }

    /* JADX INFO: renamed from: o0oo0o00.OooOo$OooO0O0 */
    public static final class OooO0O0<T> extends AbstractC31298OooOO0o<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Type f111772OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f111773OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Object f111774OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public AbstractC31298OooOO0o<T> f111775OooO0Oo;

        public OooO0O0(Type type, String str, Object obj) {
            this.f111772OooO00o = type;
            this.f111773OooO0O0 = str;
            this.f111774OooO0OO = obj;
        }

        @Override // o0oo0o00.AbstractC31298OooOO0o
        public final Object OooO00o(C31303OooOOo c31303OooOOo) throws IOException {
            AbstractC31298OooOO0o<T> abstractC31298OooOO0o = this.f111775OooO0Oo;
            if (abstractC31298OooOO0o != null) {
                return abstractC31298OooOO0o.OooO00o(c31303OooOOo);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        @Override // o0oo0o00.AbstractC31298OooOO0o
        public final void OooO0OO(C31305OooOOoo c31305OooOOoo, Object obj) throws IOException {
            AbstractC31298OooOO0o<T> abstractC31298OooOO0o = this.f111775OooO0Oo;
            if (abstractC31298OooOO0o == null) {
                throw new IllegalStateException("JsonAdapter isn't ready");
            }
            abstractC31298OooOO0o.OooO0OO(c31305OooOOoo, obj);
        }

        public final String toString() {
            AbstractC31298OooOO0o<T> abstractC31298OooOO0o = this.f111775OooO0Oo;
            return abstractC31298OooOO0o != null ? abstractC31298OooOO0o.toString() : super.toString();
        }
    }

    /* JADX INFO: renamed from: o0oo0o00.OooOo$OooO0OO */
    public final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f111776OooO00o = new ArrayList();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayDeque f111777OooO0O0 = new ArrayDeque();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f111778OooO0OO;

        public OooO0OO() {
        }

        public final IllegalArgumentException OooO00o(IllegalArgumentException illegalArgumentException) {
            if (!this.f111778OooO0OO) {
                this.f111778OooO0OO = true;
                ArrayDeque arrayDeque = this.f111777OooO0O0;
                if (arrayDeque.size() != 1 || ((OooO0O0) arrayDeque.getFirst()).f111773OooO0O0 != null) {
                    StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
                    Iterator itDescendingIterator = arrayDeque.descendingIterator();
                    while (itDescendingIterator.hasNext()) {
                        OooO0O0 oooO0O0 = (OooO0O0) itDescendingIterator.next();
                        sb.append("\nfor ");
                        sb.append(oooO0O0.f111772OooO00o);
                        String str = oooO0O0.f111773OooO0O0;
                        if (str != null) {
                            sb.append(ControlChar.SPACE_CHAR);
                            sb.append(str);
                        }
                    }
                    return new IllegalArgumentException(sb.toString(), illegalArgumentException);
                }
            }
            return illegalArgumentException;
        }

        public final void OooO0O0(boolean z) {
            this.f111777OooO0O0.removeLast();
            if (this.f111777OooO0O0.isEmpty()) {
                C31306OooOo.this.f111769OooO0O0.remove();
                if (z) {
                    synchronized (C31306OooOo.this.f111770OooO0OO) {
                        try {
                            int size = this.f111776OooO00o.size();
                            for (int i = 0; i < size; i++) {
                                OooO0O0 oooO0O0 = (OooO0O0) this.f111776OooO00o.get(i);
                                AbstractC31298OooOO0o<T> abstractC31298OooOO0o = (AbstractC31298OooOO0o) C31306OooOo.this.f111770OooO0OO.put(oooO0O0.f111774OooO0OO, oooO0O0.f111775OooO0Oo);
                                if (abstractC31298OooOO0o != 0) {
                                    oooO0O0.f111775OooO0Oo = abstractC31298OooOO0o;
                                    C31306OooOo.this.f111770OooO0OO.put(oooO0O0.f111774OooO0OO, abstractC31298OooOO0o);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        f111767OooO0Oo = arrayList;
        arrayList.add(C31313OooOoO.f111819OooO00o);
        arrayList.add(AbstractC31295OooO0oo.f111736OooO0O0);
        arrayList.add(C31312OooOo0o.f111815OooO0OO);
        arrayList.add(C31288OooO00o.f111716OooO0OO);
        arrayList.add(C31319OooOoO0.f111838OooO00o);
        arrayList.add(C31294OooO0oO.f111729OooO0Oo);
    }

    public C31306OooOo(OooO00o oooO00o) {
        ArrayList arrayList = oooO00o.f111771OooO00o;
        int size = arrayList.size();
        ArrayList arrayList2 = f111767OooO0Oo;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        this.f111768OooO00o = Collections.unmodifiableList(arrayList3);
    }

    public final <T> AbstractC31298OooOO0o<T> OooO00o(Class<T> cls) {
        return OooO0O0(cls, C31286OooO0O0.f111706OooO00o, null);
    }

    public final <T> AbstractC31298OooOO0o<T> OooO0O0(Type type, Set<? extends Annotation> set, String str) {
        OooO0O0 oooO0O0;
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeOooO00o = C31286OooO0O0.OooO00o(type);
        if (typeOooO00o instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) typeOooO00o;
            if (wildcardType.getLowerBounds().length == 0) {
                Type[] upperBounds = wildcardType.getUpperBounds();
                if (upperBounds.length != 1) {
                    throw new IllegalArgumentException();
                }
                typeOooO00o = upperBounds[0];
            }
        }
        Object objAsList = set.isEmpty() ? typeOooO00o : Arrays.asList(typeOooO00o, set);
        synchronized (this.f111770OooO0OO) {
            try {
                AbstractC31298OooOO0o<T> abstractC31298OooOO0o = (AbstractC31298OooOO0o) this.f111770OooO0OO.get(objAsList);
                if (abstractC31298OooOO0o != null) {
                    return abstractC31298OooOO0o;
                }
                OooO0OO oooO0OO = this.f111769OooO0O0.get();
                if (oooO0OO == null) {
                    oooO0OO = new OooO0OO();
                    this.f111769OooO0O0.set(oooO0OO);
                }
                ArrayList arrayList = oooO0OO.f111776OooO00o;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    ArrayDeque arrayDeque = oooO0OO.f111777OooO0O0;
                    if (i >= size) {
                        OooO0O0 oooO0O02 = new OooO0O0(typeOooO00o, str, objAsList);
                        arrayList.add(oooO0O02);
                        arrayDeque.add(oooO0O02);
                        oooO0O0 = null;
                        break;
                    }
                    oooO0O0 = (OooO0O0) arrayList.get(i);
                    if (oooO0O0.f111774OooO0OO.equals(objAsList)) {
                        arrayDeque.add(oooO0O0);
                        AbstractC31298OooOO0o<T> abstractC31298OooOO0o2 = oooO0O0.f111775OooO0Oo;
                        if (abstractC31298OooOO0o2 != null) {
                            oooO0O0 = abstractC31298OooOO0o2;
                        }
                    } else {
                        i++;
                    }
                }
                try {
                    if (oooO0O0 != null) {
                        return oooO0O0;
                    }
                    try {
                        int size2 = this.f111768OooO00o.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            AbstractC31298OooOO0o<T> abstractC31298OooOO0o3 = (AbstractC31298OooOO0o<T>) this.f111768OooO00o.get(i2).OooO00o(typeOooO00o, set, this);
                            if (abstractC31298OooOO0o3 != null) {
                                ((OooO0O0) oooO0OO.f111777OooO0O0.getLast()).f111775OooO0Oo = abstractC31298OooOO0o3;
                                oooO0OO.OooO0O0(true);
                                return abstractC31298OooOO0o3;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + C31286OooO0O0.OooO0oO(typeOooO00o, set));
                    } catch (IllegalArgumentException e) {
                        throw oooO0OO.OooO00o(e);
                    }
                } finally {
                    oooO0OO.OooO0O0(false);
                }
            } finally {
            }
        }
    }
}
