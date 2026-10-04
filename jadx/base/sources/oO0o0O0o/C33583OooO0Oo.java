package oO0o0O0o;

import com.aspose.slides.C22218Oooo;
import io.ktor.utils.p616io.C23968Oooo00o;

/* JADX INFO: renamed from: oO0o0O0o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33583OooO0Oo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C33583OooO0Oo f121243OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f121244OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f121245OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0 f121246OooO0OO;

    /* JADX INFO: renamed from: oO0o0O0o.OooO0Oo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f121247OooO00o;

        static {
            OooO00o oooO00o = new OooO00o();
            if (!C23968Oooo00o.OooO0O0("  ") && !C23968Oooo00o.OooO0O0("") && !C23968Oooo00o.OooO0O0("")) {
                C23968Oooo00o.OooO0O0("");
            }
            f121247OooO00o = oooO00o;
        }

        public final void OooO00o(String str, StringBuilder sb) {
            OooOO0.OooO0O0.OooO0Oo(Integer.MAX_VALUE, str, "bytesPerLine = ", ",", sb);
            sb.append('\n');
            sb.append(str);
            sb.append("bytesPerGroup = ");
            sb.append(Integer.MAX_VALUE);
            sb.append(",");
            sb.append('\n');
            sb.append(str);
            sb.append("groupSeparator = \"");
            sb.append("  ");
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("byteSeparator = \"");
            sb.append("");
            sb.append("\",");
            sb.append('\n');
            OooOO0.OooO0OO.OooO0o0(sb, str, "bytePrefix = \"", "", "\",");
            sb.append('\n');
            sb.append(str);
            sb.append("byteSuffix = \"");
            sb.append("");
            sb.append("\"");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BytesHexFormat(\n");
            OooO00o("    ", sb);
            sb.append('\n');
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: oO0o0O0o.OooO0Oo$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final OooO0O0 f121248OooO0O0 = new OooO0O0();

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f121249OooO00o = true;

        public OooO0O0() {
            if (C23968Oooo00o.OooO0O0("")) {
                return;
            }
            C23968Oooo00o.OooO0O0("");
        }

        public final void OooO00o(String str, StringBuilder sb) {
            OooOO0.OooO0OO.OooO0o0(sb, str, "prefix = \"", "", "\",");
            sb.append('\n');
            sb.append(str);
            sb.append("suffix = \"");
            sb.append("");
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("removeLeadingZeros = ");
            sb.append(false);
            sb.append(',');
            sb.append('\n');
            sb.append(str);
            sb.append("minLength = ");
            sb.append(1);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NumberHexFormat(\n");
            OooO00o("    ", sb);
            sb.append('\n');
            sb.append(")");
            return sb.toString();
        }
    }

    static {
        OooO00o oooO00o = OooO00o.f121247OooO00o;
        OooO0O0 oooO0O0 = OooO0O0.f121248OooO0O0;
        f121243OooO0Oo = new C33583OooO0Oo(false, oooO00o, oooO0O0);
        new C33583OooO0Oo(true, oooO00o, oooO0O0);
    }

    public C33583OooO0Oo(boolean z, OooO00o bytes, OooO0O0 number) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(bytes, "bytes");
        kotlin.jvm.internal.OooOOO0.OooO0oO(number, "number");
        this.f121244OooO00o = z;
        this.f121245OooO0O0 = bytes;
        this.f121246OooO0OO = number;
    }

    public final String toString() {
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("HexFormat(\n    upperCase = ");
        sbOooO0OO.append(this.f121244OooO00o);
        sbOooO0OO.append(",\n    bytes = BytesHexFormat(\n");
        this.f121245OooO0O0.OooO00o("        ", sbOooO0OO);
        sbOooO0OO.append('\n');
        sbOooO0OO.append("    ),");
        sbOooO0OO.append('\n');
        sbOooO0OO.append("    number = NumberHexFormat(");
        sbOooO0OO.append('\n');
        this.f121246OooO0OO.OooO00o("        ", sbOooO0OO);
        sbOooO0OO.append('\n');
        sbOooO0OO.append("    )");
        sbOooO0OO.append('\n');
        sbOooO0OO.append(")");
        return sbOooO0OO.toString();
    }
}
