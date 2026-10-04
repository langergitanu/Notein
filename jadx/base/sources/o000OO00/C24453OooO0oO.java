package o000OO00;

import androidx.appcompat.widget.C21532OooOOo;
import androidx.ink.brush.BrushBehaviorNative;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.C24019OooOO0o;
import kotlin.jvm.internal.C24028OooOoO0;
import o0OoO0o.AbstractC28656OooOOO0;
import o0OoO0o.AbstractC28662OooOo;
import o0OoO0o.AbstractC28667OooOoO;
import o0OoO0o.C28641OooO00o;
import o0OoO0o.C28643OooO0OO;
import o0OoO0o.C28649OooO0o0;
import o0OoO0o.C28653OooOO0O;
import o0OoO0o.C28654OooOO0o;
import o0OoO0o.C28655OooOOO;
import o0OoO0o.C28658OooOOOo;
import o0OoO0o.C28661OooOOoo;
import o0OoO0o.C28663OooOo0;
import o0OoO0o.C28666OooOo0o;
import o0OoO0o.C28668OooOoO0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34426OooOO0o;
import oOo000Oo.C34434OooOoO;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: renamed from: o000OO00.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24453OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000OOoO.OooO0O0 f82642OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<AbstractC28662OooOo> f82643OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f82644OooO0OO;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f82641OooO0o0 = {new C24028OooOoO0(C24453OooO0oO.class, "nativePointer", "getNativePointer()J", 0)};

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO00o f82640OooO0Oo = new OooO00o();

    /* JADX INFO: renamed from: o000OO00.OooO0oO$OooO00o */
    public static final class OooO00o {
    }

    /* JADX INFO: renamed from: o000OO00.OooO0oO$OooO0O0 */
    public static final /* synthetic */ class OooO0O0 extends C24019OooOO0o implements InterfaceC32507OooOO0o<Long, C32460OooOooO> {
        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(Long l) {
            ((BrushBehaviorNative) this.receiver).free(l.longValue());
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List<? extends o0OoO0o.OooOo>] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [o000OO00.OooO0o, oO0O000o.OooO00o] */
    public C24453OooO0oO(oO0O000o.OooO00o<Long> oooO00o, List<? extends AbstractC28662OooOo> list, String str) {
        Object c28663OooOo0;
        BrushBehaviorNative brushBehaviorNative = BrushBehaviorNative.f65345OooO00o;
        this.f82642OooO00o = new o000OOoO.OooO0O0(oooO00o, new OooO0O0(1, brushBehaviorNative, BrushBehaviorNative.class, DrawToolFactory.LASSO_TYPE_FREE, "free(J)V", 0));
        if (list == 0) {
            list = new ArrayList<>();
            C34426OooOO0o c34426OooOO0o = new C34426OooOO0o();
            int nodeCount = brushBehaviorNative.getNodeCount(OooO00o());
            for (final int i = 0; i < nodeCount; i++) {
                AbstractC28656OooOOO0.OooO00o oooO00o2 = AbstractC28656OooOOO0.f101553OooO0OO;
                ?? r3 = new oO0O000o.OooO00o() { // from class: o000OO00.OooO0o
                    @Override // oO0O000o.OooO00o
                    public final Object invoke() {
                        return Long.valueOf(BrushBehaviorNative.f65345OooO00o.newCopyOfNode(this.f82636OooOo0o.OooO00o(), i));
                    }
                };
                int nodeTypeInt = BrushBehaviorNative.f65345OooO00o.getNodeTypeInt(OooO00o(), i);
                oooO00o2.getClass();
                switch (nodeTypeInt) {
                    case 0:
                        c28663OooOo0 = new C28663OooOo0(r3);
                        break;
                    case 1:
                        c28663OooOo0 = new C28643OooO0OO(r3, C34434OooOoO.f123453OooOo0o);
                        break;
                    case 2:
                        c28663OooOo0 = new C28655OooOOO(r3);
                        break;
                    case 3:
                        c28663OooOo0 = new C28668OooOoO0(r3, (AbstractC28667OooOoO) c34426OooOO0o.removeLast());
                        break;
                    case 4:
                        c28663OooOo0 = new C28649OooO0o0(r3, (AbstractC28667OooOoO) c34426OooOO0o.removeLast());
                        break;
                    case 5:
                        c28663OooOo0 = new C28661OooOOoo(r3, (AbstractC28667OooOoO) c34426OooOO0o.removeLast(), null);
                        break;
                    case 6:
                        c28663OooOo0 = new C28653OooOO0O(r3, (AbstractC28667OooOoO) c34426OooOO0o.removeLast());
                        break;
                    case 7:
                        int i2 = C28641OooO00o.f101517OooO0oo;
                        c28663OooOo0 = new C28641OooO00o(r3, (AbstractC28667OooOoO) c34426OooOO0o.removeLast(), (AbstractC28667OooOoO) c34426OooOO0o.removeLast());
                        break;
                    case 8:
                        int i3 = C28654OooOO0o.f101545OooO;
                        c28663OooOo0 = new C28654OooOO0o(r3, (AbstractC28667OooOoO) c34426OooOO0o.removeLast(), (AbstractC28667OooOoO) c34426OooOO0o.removeLast(), (AbstractC28667OooOoO) c34426OooOO0o.removeLast());
                        break;
                    case 9:
                        c28663OooOo0 = new C28666OooOo0o(r3, (AbstractC28667OooOoO) c34426OooOO0o.removeLast());
                        break;
                    case 10:
                        int i4 = C28658OooOOOo.f101561OooO0oo;
                        c28663OooOo0 = new C28658OooOOOo(r3, (AbstractC28667OooOoO) c34426OooOO0o.removeLast(), (AbstractC28667OooOoO) c34426OooOO0o.removeLast());
                        break;
                    default:
                        throw new IllegalArgumentException(C21532OooOOo.OooO0OO(nodeTypeInt, "Unknown node type: "));
                }
                if (c28663OooOo0 instanceof AbstractC28662OooOo) {
                    list.add(c28663OooOo0);
                } else {
                    if (!(c28663OooOo0 instanceof AbstractC28667OooOoO)) {
                        throw new IllegalArgumentException("Node must either be a TerminalNode or ValueNode: " + c28663OooOo0);
                    }
                    c34426OooOO0o.addLast(c28663OooOo0);
                }
            }
        }
        List<AbstractC28662OooOo> listUnmodifiableList = Collections.unmodifiableList(oOo000Oo.OooOo.o0ooOO0((Iterable) list));
        kotlin.jvm.internal.OooOOO0.OooO0o(listUnmodifiableList, "unmodifiableList(...)");
        this.f82643OooO0O0 = listUnmodifiableList;
        this.f82644OooO0OO = str == null ? BrushBehaviorNative.f65345OooO00o.getDeveloperComment(OooO00o()) : str;
    }

    public final long OooO00o() {
        return this.f82642OooO00o.OooO00o(this, f82641OooO0o0[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C24453OooO0oO)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C24453OooO0oO c24453OooO0oO = (C24453OooO0oO) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f82643OooO0O0, c24453OooO0oO.f82643OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f82644OooO0OO, c24453OooO0oO.f82644OooO0OO);
    }

    public final int hashCode() {
        return this.f82644OooO0OO.hashCode() + (this.f82643OooO0O0.hashCode() * 31);
    }

    public final String toString() {
        return "BrushBehavior(" + this.f82643OooO0O0 + ", developerComment=" + this.f82644OooO0OO + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C24453OooO0oO(C28666OooOo0o c28666OooOo0o) {
        List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(c28666OooOo0o);
        this(new C24452OooO0o0(0, listOooO0oO, ""), listOooO0oO, "");
    }
}
