package com.orion.penkit.models;

import com.facebook.common.callercontext.ContextChain;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.orion.penkit.models.AssistPoint;
import java.lang.Comparable;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000OoO.C24536OooO0Oo;
import oO00ooO.C32442OooOO0o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOOO;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\r\bf\u0018\u0000 #*\u0012\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u0003*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00010\u00052\u00020\u0006:\u0004 !\"#J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH'J\u001d\u0010\t\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H'¢\u0006\u0002\u0010\fJ\u0015\u0010\r\u001a\u00028\u0001*\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0000H\u0082\u0004J+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0013\u001a\u00020\u0014H'¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016J\u001b\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u00172\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001aJ\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00172\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001aJ\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017H\u0016J%\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001f¨\u0006$"}, m80612d2 = {"Lcom/orion/penkit/models/AnchorAssistAware;", "T", "", "", "P", "Lcom/orion/penkit/models/AssistPoint;", "", "getTypedRect", "Lcom/orion/penkit/models/TypedRect;", "createAssistPoint", "x", "y", "(Ljava/lang/Number;Ljava/lang/Number;)Lcom/orion/penkit/models/AssistPoint;", "combineTo", "other", "createAssistLine", "Lcom/orion/penkit/models/AnchorAssistLine;", "p1", "p2", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Lcom/orion/penkit/models/AnchorAssistAware$Direction;", "(Lcom/orion/penkit/models/AssistPoint;Lcom/orion/penkit/models/AssistPoint;Lcom/orion/penkit/models/AnchorAssistAware$Direction;)Lcom/orion/penkit/models/AnchorAssistLine;", "getYCoordinates", "", "getXCoordinates", "getVerticalAssistPoints", "(Ljava/lang/Number;)Ljava/util/Set;", "getHorizontalAssistPoints", "getAllAssistPoints", "getAssistLine", ContextChain.TAG_PRODUCT, "(Lcom/orion/penkit/models/AnchorAssistAware$Direction;Lcom/orion/penkit/models/AssistPoint;)Lcom/orion/penkit/models/AnchorAssistLine;", "Direction", "Horizontal", "Vertical", "Switch", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public interface AnchorAssistAware<T extends Number & Comparable<? super T>, P extends AssistPoint<T>> {

    /* JADX INFO: renamed from: Switch, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m80613k = 3, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class DefaultImpls {
        private static <T extends Number & Comparable<? super T>, P extends AssistPoint<T>> P combineTo(AnchorAssistAware<T, P> anchorAssistAware, T t, T t2) {
            return (P) anchorAssistAware.createAssistPoint(t, t2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <T extends Number & Comparable<? super T>, P extends AssistPoint<T>> Set<P> getAllAssistPoints(AnchorAssistAware<T, P> anchorAssistAware) {
            return OooOOO.OoooOo0(new AssistPoint[]{combineTo(anchorAssistAware, anchorAssistAware.getTypedRect().getLeft(), anchorAssistAware.getTypedRect().getTop()), combineTo(anchorAssistAware, anchorAssistAware.getTypedRect().getRight(), anchorAssistAware.getTypedRect().getTop()), combineTo(anchorAssistAware, anchorAssistAware.getTypedRect().getLeft(), anchorAssistAware.getTypedRect().getBottom()), combineTo(anchorAssistAware, anchorAssistAware.getTypedRect().getRight(), anchorAssistAware.getTypedRect().getBottom()), combineTo(anchorAssistAware, (Number) anchorAssistAware.getTypedRect().getCenter().f116638OooOo0o, anchorAssistAware.getTypedRect().getTop()), combineTo(anchorAssistAware, (Number) anchorAssistAware.getTypedRect().getCenter().f116638OooOo0o, anchorAssistAware.getTypedRect().getBottom()), combineTo(anchorAssistAware, anchorAssistAware.getTypedRect().getLeft(), (Number) anchorAssistAware.getTypedRect().getCenter().f116637OooOo), combineTo(anchorAssistAware, anchorAssistAware.getTypedRect().getRight(), (Number) anchorAssistAware.getTypedRect().getCenter().f116637OooOo)});
        }

        public static <T extends Number & Comparable<? super T>, P extends AssistPoint<T>> AnchorAssistLine<T> getAssistLine(AnchorAssistAware<T, P> anchorAssistAware, Direction direction, P p) {
            OooOOO0.OooO0oO(direction, "direction");
            OooOOO0.OooO0oO(p, "p");
            if (!direction.equals(Horizontal.INSTANCE)) {
                if (!direction.equals(Vertical.INSTANCE)) {
                    throw new C32442OooOO0o();
                }
                if (anchorAssistAware.getXCoordinates().contains(p.getX())) {
                    List listO00O0O = OooOo.o00O0O(anchorAssistAware.getVerticalAssistPoints(p.getX()), new Comparator() { // from class: com.orion.penkit.models.AnchorAssistAware$DefaultImpls$getAssistLine$$inlined$compareBy$2
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return C24536OooO0Oo.OooO0O0((Comparable) ((AssistPoint) t).getY(), (Comparable) ((AssistPoint) t2).getY());
                        }
                    });
                    if (!listO00O0O.isEmpty()) {
                        List<AssistPoint> list = listO00O0O;
                        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((AssistPoint) it.next()).getY());
                        }
                        Number number = (Number) OooOo.Oooo0oO(arrayList);
                        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((AssistPoint) it2.next()).getY());
                        }
                        Number number2 = (Number) OooOo.OoooOOo(arrayList2);
                        for (AssistPoint assistPoint : list) {
                            if (((Comparable) assistPoint.getY()).compareTo(number) == 0) {
                                for (AssistPoint assistPoint2 : list) {
                                    if (((Comparable) assistPoint2.getY()).compareTo(number2) == 0) {
                                        Comparable comparable = (Comparable) p.getY();
                                        if (comparable.compareTo(number) >= 0 && comparable.compareTo(number2) <= 0) {
                                            return anchorAssistAware.createAssistLine(assistPoint, assistPoint2, Vertical.INSTANCE);
                                        }
                                        if (((Comparable) p.getY()).compareTo(number) < 0) {
                                            return anchorAssistAware.createAssistLine(p, assistPoint2, Vertical.INSTANCE);
                                        }
                                        if (((Comparable) p.getY()).compareTo(number2) > 0) {
                                            return anchorAssistAware.createAssistLine(assistPoint, p, Vertical.INSTANCE);
                                        }
                                        return null;
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
            } else if (anchorAssistAware.getYCoordinates().contains(p.getY())) {
                List listO00O0O2 = OooOo.o00O0O(anchorAssistAware.getHorizontalAssistPoints(p.getY()), new Comparator() { // from class: com.orion.penkit.models.AnchorAssistAware$DefaultImpls$getAssistLine$$inlined$compareBy$1
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return C24536OooO0Oo.OooO0O0((Comparable) ((AssistPoint) t).getX(), (Comparable) ((AssistPoint) t2).getX());
                    }
                });
                if (!listO00O0O2.isEmpty()) {
                    List<AssistPoint> list2 = listO00O0O2;
                    ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((AssistPoint) it3.next()).getX());
                    }
                    Number number3 = (Number) OooOo.Oooo0oO(arrayList3);
                    ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                    Iterator it4 = list2.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(((AssistPoint) it4.next()).getX());
                    }
                    Number number4 = (Number) OooOo.OoooOOo(arrayList4);
                    for (AssistPoint assistPoint3 : list2) {
                        if (((Comparable) assistPoint3.getX()).compareTo(number3) == 0) {
                            for (AssistPoint assistPoint4 : list2) {
                                if (((Comparable) assistPoint4.getX()).compareTo(number4) == 0) {
                                    Comparable comparable2 = (Comparable) p.getX();
                                    if (comparable2.compareTo(number3) >= 0 && comparable2.compareTo(number4) <= 0) {
                                        return anchorAssistAware.createAssistLine(assistPoint3, assistPoint4, Horizontal.INSTANCE);
                                    }
                                    if (((Comparable) p.getX()).compareTo(number3) < 0) {
                                        return anchorAssistAware.createAssistLine(p, assistPoint4, Horizontal.INSTANCE);
                                    }
                                    if (((Comparable) p.getX()).compareTo(number4) > 0) {
                                        return anchorAssistAware.createAssistLine(p, assistPoint3, Horizontal.INSTANCE);
                                    }
                                    return null;
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            return null;
        }

        public static <T extends Number & Comparable<? super T>, P extends AssistPoint<T>> Set<P> getHorizontalAssistPoints(AnchorAssistAware<T, P> anchorAssistAware, T y) {
            OooOOO0.OooO0oO(y, "y");
            Set<P> allAssistPoints = anchorAssistAware.getAllAssistPoints();
            ArrayList arrayList = new ArrayList();
            for (Object obj : allAssistPoints) {
                if (((Comparable) ((AssistPoint) obj).getY()).compareTo(y) == 0) {
                    arrayList.add(obj);
                }
            }
            return OooOo.o0OO00O(arrayList);
        }

        public static <T extends Number & Comparable<? super T>, P extends AssistPoint<T>> Set<P> getVerticalAssistPoints(AnchorAssistAware<T, P> anchorAssistAware, T x) {
            OooOOO0.OooO0oO(x, "x");
            Set<P> allAssistPoints = anchorAssistAware.getAllAssistPoints();
            ArrayList arrayList = new ArrayList();
            for (Object obj : allAssistPoints) {
                if (((Comparable) ((AssistPoint) obj).getX()).compareTo(x) == 0) {
                    arrayList.add(obj);
                }
            }
            return OooOo.o0OO00O(arrayList);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <T extends Number & Comparable<? super T>, P extends AssistPoint<T>> Set<T> getXCoordinates(AnchorAssistAware<T, P> anchorAssistAware) {
            return OooOOO.OoooOo0(new Number[]{anchorAssistAware.getTypedRect().getLeft(), anchorAssistAware.getTypedRect().getRight(), anchorAssistAware.getTypedRect().getCenter().f116638OooOo0o});
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <T extends Number & Comparable<? super T>, P extends AssistPoint<T>> Set<T> getYCoordinates(AnchorAssistAware<T, P> anchorAssistAware) {
            return OooOOO.OoooOo0(new Number[]{anchorAssistAware.getTypedRect().getTop(), anchorAssistAware.getTypedRect().getBottom(), anchorAssistAware.getTypedRect().getCenter().f116637OooOo});
        }
    }

    @Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/penkit/models/AnchorAssistAware$Direction;", "", "Lcom/orion/penkit/models/AnchorAssistAware$Horizontal;", "Lcom/orion/penkit/models/AnchorAssistAware$Vertical;", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public interface Direction {
    }

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/penkit/models/AnchorAssistAware$Horizontal;", "Lcom/orion/penkit/models/AnchorAssistAware$Direction;", "<init>", "()V", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Horizontal implements Direction {
        public static final Horizontal INSTANCE = new Horizontal();

        private Horizontal() {
        }
    }

    /* JADX INFO: renamed from: com.orion.penkit.models.AnchorAssistAware$Switch, reason: from kotlin metadata */
    @Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, m80612d2 = {"Lcom/orion/penkit/models/AnchorAssistAware$Switch;", "", "<init>", "()V", "enableAssistLine", "", "getEnableAssistLine", "()Z", "setEnableAssistLine", "(Z)V", "enableAssistLineMagneticAttraction", "getEnableAssistLineMagneticAttraction", "setEnableAssistLineMagneticAttraction", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static boolean enableAssistLine = true;
        private static boolean enableAssistLineMagneticAttraction = true;

        private Companion() {
        }

        public final boolean getEnableAssistLine() {
            return enableAssistLine;
        }

        public final boolean getEnableAssistLineMagneticAttraction() {
            return enableAssistLineMagneticAttraction;
        }

        public final void setEnableAssistLine(boolean z) {
            enableAssistLine = z;
        }

        public final void setEnableAssistLineMagneticAttraction(boolean z) {
            enableAssistLineMagneticAttraction = z;
        }
    }

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/penkit/models/AnchorAssistAware$Vertical;", "Lcom/orion/penkit/models/AnchorAssistAware$Direction;", "<init>", "()V", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Vertical implements Direction {
        public static final Vertical INSTANCE = new Vertical();

        private Vertical() {
        }
    }

    @MetaApi
    AnchorAssistLine<T> createAssistLine(P p1, P p2, Direction direction);

    @MetaApi
    P createAssistPoint(T x, T y);

    Set<P> getAllAssistPoints();

    AnchorAssistLine<T> getAssistLine(Direction direction, P p);

    Set<P> getHorizontalAssistPoints(T y);

    @MetaApi
    TypedRect<T> getTypedRect();

    Set<P> getVerticalAssistPoints(T x);

    Set<T> getXCoordinates();

    Set<T> getYCoordinates();
}
