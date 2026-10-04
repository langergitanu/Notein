package oO0o0O0o;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import o0O0OoO0.C25898OooO0Oo;
import o0O0oooo.C26378OooOo0O;
import oO0o0O0O.C33576OooOOOo;
import oO0o0O0O.C33577OooOOo;
import oOo000Oo.AbstractC34419OooO0O0;
import oOo000Oo.AbstractC34421OooO0Oo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: oO0o0O0o.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33587OooO0oo implements InterfaceC33586OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Matcher f121257OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final CharSequence f121258OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO00o f121259OooO0OO;

    /* JADX INFO: renamed from: oO0o0O0o.OooO0oo$OooO00o */
    public static final class OooO00o extends AbstractC34421OooO0Oo<String> {
        public OooO00o() {
        }

        @Override // oOo000Oo.AbstractC34419OooO0O0
        public final int OooO0O0() {
            return C33587OooO0oo.this.f121257OooO00o.groupCount() + 1;
        }

        @Override // oOo000Oo.AbstractC34419OooO0O0, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return super.contains((String) obj);
            }
            return false;
        }

        @Override // java.util.List
        public final Object get(int i) {
            String strGroup = C33587OooO0oo.this.f121257OooO00o.group(i);
            return strGroup == null ? "" : strGroup;
        }

        @Override // oOo000Oo.AbstractC34421OooO0Oo, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return super.indexOf((String) obj);
            }
            return -1;
        }

        @Override // oOo000Oo.AbstractC34421OooO0Oo, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return super.lastIndexOf((String) obj);
            }
            return -1;
        }
    }

    /* JADX INFO: renamed from: oO0o0O0o.OooO0oo$OooO0O0 */
    public static final class OooO0O0 extends AbstractC34419OooO0O0<C33584OooO0o> {
        public OooO0O0() {
        }

        @Override // oOo000Oo.AbstractC34419OooO0O0
        public final int OooO0O0() {
            return C33587OooO0oo.this.f121257OooO00o.groupCount() + 1;
        }

        @Override // oOo000Oo.AbstractC34419OooO0O0, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof C33584OooO0o) {
                return super.contains((C33584OooO0o) obj);
            }
            return false;
        }

        @Override // oOo000Oo.AbstractC34419OooO0O0, java.util.Collection
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<C33584OooO0o> iterator() {
            return new C33577OooOOo.OooO00o(C33576OooOOOo.OooOOoo(OooOo.OooOooo(C34429OooOOo0.OooOO0(this)), new C26378OooOo0O(this, 1)));
        }
    }

    public C33587OooO0oo(Matcher matcher, CharSequence input) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(input, "input");
        this.f121257OooO00o = matcher;
        this.f121258OooO0O0 = input;
        new OooO0O0();
    }

    public final List<String> OooO00o() {
        if (this.f121259OooO0OO == null) {
            this.f121259OooO0OO = new OooO00o();
        }
        OooO00o oooO00o = this.f121259OooO0OO;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO00o);
        return oooO00o;
    }

    public final oO0O00oo.OooO OooO0O0() {
        Matcher matcher = this.f121257OooO00o;
        return oO0O00oo.OooOO0.OooO(matcher.start(), matcher.end());
    }

    @Override // oO0o0O0o.InterfaceC33586OooO0oO
    public final String getValue() {
        String strGroup = this.f121257OooO00o.group();
        kotlin.jvm.internal.OooOOO0.OooO0o(strGroup, "group(...)");
        return strGroup;
    }

    @Override // oO0o0O0o.InterfaceC33586OooO0oO
    public final C33587OooO0oo next() {
        Matcher matcher = this.f121257OooO00o;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f121258OooO0O0;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        kotlin.jvm.internal.OooOOO0.OooO0o(matcher2, "matcher(...)");
        return C25898OooO0Oo.OooO00o(matcher2, iEnd, charSequence);
    }
}
