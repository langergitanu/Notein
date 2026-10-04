package com.aspose.slides.internal.p204jf;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.internal.p217k4.AbstractC5590ks;
import com.aspose.slides.internal.p217k4.AbstractC5596to;
import com.aspose.slides.internal.p217k4.C5579bv;
import com.aspose.slides.internal.p217k4.C5581ck;
import com.aspose.slides.internal.p217k4.C5584fa;
import com.aspose.slides.internal.p217k4.C5593ne;
import com.aspose.slides.internal.p217k4.C5598um;
import com.aspose.slides.internal.p217k4.C5599up;
import com.aspose.slides.internal.p217k4.C5602wl;
import com.aspose.slides.internal.p217k4.InterfaceC5585h4;
import com.aspose.slides.internal.p217k4.InterfaceC5591lr;
import com.aspose.slides.internal.p217k4.InterfaceC5607yj;
import com.aspose.slides.p559ms.System.C14117yj;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;

/* JADX INFO: renamed from: com.aspose.slides.internal.jf.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C5445k4 extends AbstractC5590ks {

    /* JADX INFO: renamed from: du */
    static final String[] f14444du;

    /* JADX INFO: renamed from: fa */
    static final short[][] f14446fa;

    /* JADX INFO: renamed from: ix */
    static final short[] f14448ix;

    /* JADX INFO: renamed from: ks */
    static final short[] f14450ks;

    /* JADX INFO: renamed from: ne */
    static final short[] f14452ne;

    /* JADX INFO: renamed from: rv */
    static final char[] f14453rv;

    /* JADX INFO: renamed from: u4 */
    static final short[][] f14454u4;

    /* JADX INFO: renamed from: up */
    static final String[] f14455up;

    /* JADX INFO: renamed from: x6 */
    static final char[] f14456x6;

    /* JADX INFO: renamed from: yj */
    static final short[] f14457yj;

    /* JADX INFO: renamed from: kk */
    protected k4 f14458kk;

    /* JADX INFO: renamed from: to */
    protected x1 f14459to;

    /* JADX INFO: renamed from: uz */
    private InterfaceC5591lr f14460uz;

    /* JADX INFO: renamed from: h4 */
    static final short[] f14447h4 = C5581ck.m22926k4("\u0001\uffff\u0002\u0004\u0003\uffff\u0001\u0004");

    /* JADX INFO: renamed from: m9 */
    static final short[] f14451m9 = C5581ck.m22926k4("\u0007\uffff");

    /* JADX INFO: renamed from: dy */
    static final char[] f14445dy = C5581ck.m22927x1("\u0003.\u0003\uffff\u0001.");

    /* JADX INFO: renamed from: c5 */
    static final char[] f14442c5 = C5581ck.m22927x1("\u00019\u0001.\u00019\u0003\uffff\u00019");

    /* JADX INFO: renamed from: jd */
    static final short[] f14449jd = C5581ck.m22926k4("\u0003\uffff\u0001\u0002\u0001\u0003\u0001\u0001\u0001\uffff");

    /* JADX INFO: renamed from: ck */
    static final short[] f14443ck = C5581ck.m22926k4("\u0007\uffff}>");

    /* JADX INFO: renamed from: com.aspose.slides.internal.jf.k4$k4 */
    public class k4 extends C5581ck {
        public k4(AbstractC5596to abstractC5596to) {
            this.f15375c5 = abstractC5596to;
            this.f15377dy = 18;
            this.f15379k4 = C5445k4.f14447h4;
            this.f15383x1 = C5445k4.f14451m9;
            this.f15380kk = C5445k4.f14445dy;
            this.f15382to = C5445k4.f14442c5;
            this.f15376du = C5445k4.f14449jd;
            this.f15378h4 = C5445k4.f14443ck;
            this.f15381m9 = C5445k4.f14446fa;
        }

        @Override // com.aspose.slides.internal.p217k4.C5581ck
        /* JADX INFO: renamed from: k4 */
        public String mo22421k4() {
            return "847:1: DecimalLiteral : ( DecimalIntegerLiteral '.' ( DecimalDigit )* ( ExponentPart )? | '.' ( DecimalDigit )+ ( ExponentPart )? | DecimalIntegerLiteral ( ExponentPart )? );";
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.jf.k4$x1 */
    public class x1 extends C5581ck {
        public x1(AbstractC5596to abstractC5596to) {
            this.f15375c5 = abstractC5596to;
            this.f15377dy = 32;
            this.f15379k4 = C5445k4.f14457yj;
            this.f15383x1 = C5445k4.f14450ks;
            this.f15380kk = C5445k4.f14453rv;
            this.f15382to = C5445k4.f14456x6;
            this.f15376du = C5445k4.f14452ne;
            this.f15378h4 = C5445k4.f14448ix;
            this.f15381m9 = C5445k4.f14454u4;
        }

        @Override // com.aspose.slides.internal.p217k4.C5581ck
        /* JADX INFO: renamed from: k4 */
        public String mo22421k4() {
            return "1:1: Tokens : ( NULL | TRUE | FALSE | BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | FUNCTION | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH | ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | CONST | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE | LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS | WhiteSpace | EOL | MultiLineComment | SingleLineComment | Identifier | DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral | StringLiteral | RegularExpressionLiteral );";
        }

        @Override // com.aspose.slides.internal.p217k4.C5581ck
        /* JADX INFO: renamed from: x1 */
        public int mo22422x1(int i, InterfaceC5607yj interfaceC5607yj) throws C5602wl {
            if (i == 0) {
                int iMo22951k4 = interfaceC5607yj.mo22951k4(1);
                int iMo22958x1 = interfaceC5607yj.mo22958x1();
                interfaceC5607yj.mo22949du();
                if (iMo22951k4 == 61) {
                    i = 118;
                } else if (iMo22951k4 == 42) {
                    i = 119;
                } else if (iMo22951k4 == 47) {
                    i = 120;
                } else if (((iMo22951k4 < 0 || iMo22951k4 > 9) && ((iMo22951k4 < 11 || iMo22951k4 > 12) && ((iMo22951k4 < 14 || iMo22951k4 > 41) && ((iMo22951k4 < 43 || iMo22951k4 > 46) && ((iMo22951k4 < 48 || iMo22951k4 > 60) && ((iMo22951k4 < 62 || iMo22951k4 > 8231) && (iMo22951k4 < 8234 || iMo22951k4 > 65535))))))) || !C5445k4.this.m22273dx()) {
                    i = 121;
                }
                interfaceC5607yj.mo22957to(iMo22958x1);
                if (i >= 0) {
                    return i;
                }
            } else if (i == 1) {
                int iMo22951k42 = interfaceC5607yj.mo22951k4(1);
                int iMo22958x12 = interfaceC5607yj.mo22958x1();
                interfaceC5607yj.mo22949du();
                i = (((iMo22951k42 < 0 || iMo22951k42 > 9) && ((iMo22951k42 < 11 || iMo22951k42 > 12) && ((iMo22951k42 < 14 || iMo22951k42 > 8231) && (iMo22951k42 < 8234 || iMo22951k42 > 65535)))) || !C5445k4.this.m22273dx()) ? 188 : 122;
                interfaceC5607yj.mo22957to(iMo22958x12);
                if (i >= 0) {
                    return i;
                }
            }
            C5602wl c5602wl = new C5602wl(mo22421k4(), 32, i, interfaceC5607yj);
            m22930k4(c5602wl);
            throw c5602wl;
        }
    }

    static {
        String[] strArr = {"\u0001\u0003\u0001\uffff\u0001\u0001\t\u0002", "\u0001\u0005", "\u0001\u0005\u0001\uffff\n\u0006", "", "", "", "\u0001\u0005\u0001\uffff\n\u0006"};
        f14444du = strArr;
        int length = strArr.length;
        f14446fa = new short[length][];
        for (int i = 0; i < length; i++) {
            f14446fa[i] = C5581ck.m22926k4(f14444du[i]);
        }
        String[] strArr2 = {"\u0001)\u0001*\u0002)\u0001*\u0012\uffff\u0001)\u0001\u001d\u0001.\u0002\uffff\u0001!\u0001\"\u0001.\u0001\u0013\u0001\u0014\u0001 \u0001\u001e\u0001\u0019\u0001\u001f\u0001\u0017\u0001(\u0001,\t-\u0001'\u0001\u0018\u0001\u001a\u0001\u001c\u0001\u001b\u0001&\u001b\uffff\u0001\u0015\u0001\uffff\u0001\u0016\u0001$\u0002\uffff\u0001\r\u0001\u0004\u0001\u0005\u0001\u0006\u0001\u0007\u0001\u0003\u0001\u000e\u0001\uffff\u0001\b\u0002\uffff\u0001\u000f\u0001\uffff\u0001\u0001\u0001\uffff\u0001\u0010\u0001\uffff\u0001\t\u0001\n\u0001\u0002\u0001\uffff\u0001\u000b\u0001\f\u0003\uffff\u0001\u0011\u0001#\u0001\u0012\u0001%!\uffff\u0001)ᗟ\uffff\u0001)ƍ\uffff\u0001)߱\uffff\u000b)\u001d\uffff\u0002*\u0005\uffff\u0001)/\uffff\u0001)ྠ\uffff\u0001)", "\u00011\u0003\uffff\u00010\u000f\uffff\u0001/", "\u00013\t\uffff\u00012\u0006\uffff\u00014", "\u00015\u0007\uffff\u00016\u0002\uffff\u00019\u0002\uffff\u00017\u0005\uffff\u00018", "\u0001;\u0002\uffff\u0001:\u0006\uffff\u0001<", "\u0001=\u0006\uffff\u0001?\u0003\uffff\u0001@\u0002\uffff\u0001>", "\u0001A\t\uffff\u0001B", "\u0001C\u0001\uffff\u0001D\t\uffff\u0001E", "\u0001F\u0006\uffff\u0001H\u0001G", "\u0001I", "\u0001K\u000b\uffff\u0001L\u0001M\u0001\uffff\u0001J\u0001\uffff\u0001N", "\u0001O\r\uffff\u0001P", "\u0001Q\u0001R", "\u0001S", "\u0001T", "\u0001U", "\u0001V\u0010\uffff\u0001W\u0002\uffff\u0001X", "", "", "", "", "", "", "\n-", "", "", "\u0001[\u0001Z", "\u0001]\u0001^", "\u0001`", "\u0001b", "\u0001d\u0011\uffff\u0001e", "\u0001g\u000f\uffff\u0001h", "\u0001j", "\u0001l", "\u0001n\u0016\uffff\u0001o", "\u0001r>\uffff\u0001q", "\u0001t", "", "", "", "\nz\u0001\uffff\u0002z\u0001\uffff\u001cz\u0001w\u0004z\u0001x\rz\u0001vῪz\u0002\uffff\udfd6z", "", "", "", "\b| \uffff\u0001{\u001f\uffff\u0001{", "", "", "\u0001}", "\u0001~", "\u0001\u007f", "\u0001\u0082\u0013\uffff\u0001\u0080\u0003\uffff\u0001\u0081", "\u0001\u0083\b\uffff\u0001\u0084", "\u0001\u0085", "\u0001\u0086", "\u0001\u0087", "\u0001\u0088", "\u0001\u0089", "\u0001\u008a", "\u0001\u008b", "\u0001\u008c", "\u0001\u008d", "\u0001\u008e\u0001\u008f", "\u0001\u0090", "\u0001\u0091", "\u0001\u0092", "\u0001\u0095\u0003\uffff\u0001\u0093\u0005\uffff\u0001\u0094", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u0014+\u0001\u0096\u0005+", "\u0001\u0098", "\u0001\u0099", "\u0001\u009a\u0003\uffff\u0001\u009b", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u0012+\u0001\u009d\u0001\u009e\u0006+", "\u0001 ", "\u0001¡", "\u0001¢", "\u0001£", "\u0001¤", "\u0001¥", "\u0001¦", "\u0001§", "\u0001¨\u0002\uffff\u0001©", "\u0001ª", "\u0001«", "\u0001¬", "\u0001\u00ad", "\u0001®", "\u0001¯", "\u0001°\u0005\uffff\u0001±", "\u0001²", "", "", "\u0001³", "", "", "\u0001¶\u0001µ", "", "\u0001¸", "", "\u0001º", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "\nz\u0001\uffff\u0002z\u0001\uffff‚z\u0002\uffff\udfd6z", "", "", "", "", "", "", "\u0001½", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001¿", "\u0001À", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001Â", "\u0001Ã", "\u0001Ä", "\u0001Å", "\u0001Æ", "\u0001Ç", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001É", "\u0001Ê", "\u0001Ë", "\u0001Ì", "\u0001Í", "\u0001Î", "\u0001Ï", "\u0001Ñ\u0001Ð", "\u0001Ò", "\u0001Ó", "\u0001Ô", "\u0001Õ", "\u0001Ö", "\u0001×", "", "\u0001Ø", "\u0001Ù", "\u0001Ú", "\u0001Û", "", "\u0001Ü", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u0004+\u0001Ý\u0015+", "", "\u0001ß\u0002\uffff\u0001à", "\u0001á", "\u0001â", "\u0001ã", "\u0001ä", "\u0001å", "\u0001æ", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001è", "\u0001é", "\u0001ê", "\u0001ë", "\u0001ì", "\u0001í", "\u0001î", "\u0001ï", "\u0001ð", "\u0001ñ", "\u0001ò", "", "", "\u0001ó", "", "", "", "", "", "", "", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "", "\u0001ö", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "", "\u0001ø", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001ú", "\u0001û", "\u0001ü", "\u0001ý", "", "\u0001þ", "\u0001ÿ", "\u0001Ā", "\u0001ā", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001Ą", "\u0001ą", "\u0001Ć", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001Ĉ", "\u0001ĉ", "\u0001Ċ", "\u0001ċ", "\u0001Č", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001ď", "\u0001Đ", "\u0001đ", "\u0001Ē", "", "\u0001ē", "\u0001Ĕ", "\u0001ĕ", "\u0001Ė", "\u0001ė", "\u0001Ę", "\u0001ę", "\u0001Ě", "", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001Ĝ", "\u0001ĝ", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001ğ", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001Ģ", "\u0001ģ", "\u0001Ĥ", "\u0001ĥ", "", "", "", "\u0001Ħ", "", "\u0001ħ", "", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u0012+\u0001Ĩ\u0007+", "\u0001Ī", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u000b+\u0001Ĭ\u000e+", "\u0001Į", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001ı", "", "", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001ĳ", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001Ķ", "\u0001ķ", "\u0001ĸ", "\u0001Ĺ", "", "", "\u0001ĺ", "\u0001Ļ", "\u0001ļ", "\u0001Ľ", "\u0001ľ", "\u0001Ŀ", "\u0001ŀ", "\u0001Ł", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001Ń", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001Ņ", "", "\u0001ņ", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "", "\u0001ň", "", "", "\u0001ŉ", "\u0001Ŋ", "\u0001ŋ", "\u0001Ō", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001Ŏ", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "", "\u0001ő", "", "\u0001Œ", "", "", "\u0001œ", "", "\u0001Ŕ", "", "", "\u0001ŕ", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001ŗ", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001Ś", "\u0001ś", "\u0001Ŝ", "\u0001ŝ", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "", "\u0001Ţ", "\u0001ţ", "", "\u0001Ť", "\u0001ť", "\u0001Ŧ", "\u0001ŧ", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "", "\u0001ũ", "", "", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001ū", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001ŭ", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "", "\u0001ů", "", "", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001ű", "\u0001Ų", "\u0001ų", "", "", "", "", "\u0001Ŵ", "\u0001ŵ", "\u0001Ŷ", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001Ź", "", "\u0001ź", "", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "", "\u0001ž", "\u0001ſ", "\u0001ƀ", "\u0001Ɓ", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "", "", "\u0001Ƅ", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "", "", "", "\u0001Ɔ", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001ƈ", "\u0001Ɖ", "", "", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", "\u0001ƍ", "", "", "", "\u0001Ǝ", "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+", ""};
        f14455up = strArr2;
        f14457yj = C5581ck.m22926k4("\u0011+\u0006\uffff\u0001Y\u0002\uffff\u0001\\\u0001_\u0001a\u0001c\u0001f\u0001i\u0001k\u0001m\u0001p\u0001s\u0001u\u0003\uffff\u0001y\u0003\uffff\u0001-\u0002\uffff\u0013+\u0001\u0097\u0003+\u0001\u009c\u0001\u009f\u0011+\u0002\uffff\u0001´\u0002\uffff\u0001·\u0001\uffff\u0001¹\u0001\uffff\u0001»\u0013\uffff\u0001¼\u0006\uffff\u0001+\u0001¾\u0002+\u0001Á\u0006+\u0001È\u000e+\u0001\uffff\u0004+\u0001\uffff\u0001+\u0001Þ\u0001\uffff\u0007+\u0001ç\u000b+\u0002\uffff\u0001ô\u0007\uffff\u0001õ\u0001\uffff\u0001+\u0001÷\u0001\uffff\u0001+\u0001ù\u0004+\u0001\uffff\u0004+\u0001Ă\u0001ă\u0003+\u0001ć\u0005+\u0001č\u0001Ď\u0004+\u0001\uffff\b+\u0001\uffff\u0001ě\u0002+\u0001Ğ\u0001+\u0001Ġ\u0001ġ\u0004+\u0003\uffff\u0001+\u0001\uffff\u0001+\u0001\uffff\u0001ĩ\u0001+\u0001ī\u0001ĭ\u0001+\u0001į\u0001İ\u0001+\u0002\uffff\u0001Ĳ\u0001+\u0001Ĵ\u0001\uffff\u0001ĵ\u0004+\u0002\uffff\b+\u0001ł\u0001+\u0001ń\u0001+\u0001\uffff\u0001+\u0001Ň\u0001\uffff\u0001+\u0002\uffff\u0004+\u0001ō\u0001+\u0001ŏ\u0001\uffff\u0001Ő\u0001\uffff\u0001+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001Ŗ\u0001+\u0001Ř\u0001ř\u0004+\u0001Ş\u0001ş\u0001Š\u0001\uffff\u0001š\u0001\uffff\u0002+\u0001\uffff\u0004+\u0001Ũ\u0001\uffff\u0001+\u0002\uffff\u0001Ū\u0001+\u0001Ŭ\u0001+\u0001Ů\u0001\uffff\u0001+\u0002\uffff\u0001Ű\u0003+\u0004\uffff\u0003+\u0001ŷ\u0001Ÿ\u0001+\u0001\uffff\u0001+\u0001\uffff\u0001Ż\u0001\uffff\u0001ż\u0001\uffff\u0001Ž\u0001\uffff\u0004+\u0001Ƃ\u0001ƃ\u0002\uffff\u0001+\u0001ƅ\u0003\uffff\u0001+\u0001Ƈ\u0002+\u0002\uffff\u0001Ɗ\u0001\uffff\u0001Ƌ\u0001\uffff\u0001ƌ\u0001+\u0003\uffff\u0001+\u0001Ə\u0001\uffff");
        f14450ks = C5581ck.m22926k4("Ɛ\uffff");
        f14453rv = C5581ck.m22927x1("\u0001\t\u0001a\u0001h\u0001a\u0001o\u0001a\u0001e\u0001l\u0001f\u0001e\u0001h\u0001a\u0001h\u0001b\u0002o\u0001a\u0006\uffff\u00010\u0002\uffff\u0001<\u0003=\u0001+\u0001-\u0002=\u0001&\u0002=\u0003\uffff\u0001\u0000\u0003\uffff\u00010\u0002\uffff\u0001l\u0001w\u0001t\u0001a\u0001i\u0001p\u0001l\u0001n\u0001r\u0001n\u0001o\u0001e\u0001o\u0001t\u0001s\u0001n\u0002a\u0001b\u0001$\u0001s\u0001u\u0001p\u0002$\u0001p\u0001t\u0001i\u0001o\u0001a\u0001p\u0001n\u0001r\u0002i\u0001t\u0001s\u0001t\u0001n\u0001c\u0001i\u0001b\u0002\uffff\u0001=\u0002\uffff\u0001=\u0001\uffff\u0001=\u0001\uffff\u0001=\u0013\uffff\u0001\u0000\u0006\uffff\u0001l\u0001$\u0001i\u0001e\u0001$\u0001n\u0001s\u0001o\u0001e\u0001s\u0001a\u0001$\u0001c\u0002a\u0001l\u0002e\u0001c\u0001s\u0001r\u0001s\u0001a\u0001e\u0001u\u0001b\u0001\uffff\u0001e\u0001m\u0001o\u0001e\u0001\uffff\u0001t\u0001$\u0001\uffff\u0001l\u0001u\u0001t\u0001r\u0001t\u0001e\u0001c\u0001$\u0001d\u0001a\u0001l\u0001h\u0001t\u0001o\u0001g\u0001k\u0001v\u0001t\u0001l\u0002\uffff\u0001=\u0007\uffff\u0001$\u0001\uffff\u0001v\u0001$\u0001\uffff\u0001s\u0001$\u0001w\u0001o\u0001e\u0001l\u0001\uffff\u0002t\u0001k\u0001e\u0002$\u0001h\u0001i\u0001t\u0001$\u0001s\u0001u\u0001t\u0001g\u0001l\u0002$\u0001r\u0001n\u0001a\u0001r\u0001\uffff\u0001e\u0002r\u0001c\u0001t\u0001i\u0001r\u0001h\u0001\uffff\u0001$\u0001t\u0001e\u0001$\u0001r\u0002$\u0002a\u0001e\u0001i\u0003\uffff\u0001e\u0001\uffff\u0001i\u0001\uffff\u0001$\u0001f\u0002$\u0001i\u0002$\u0001a\u0002\uffff\u0001$\u0001n\u0001$\u0001\uffff\u0001$\u0001l\u0001e\u0001g\u0001e\u0002\uffff\u0001t\u0001d\u0001n\u0001f\u0001m\u0001t\u0001n\u0001h\u0001$\u0001c\u0001$\u0001r\u0001\uffff\u0001i\u0001$\u0001\uffff\u0001a\u0002\uffff\u0001g\u0001t\u0002c\u0001$\u0001e\u0001$\u0001\uffff\u0001$\u0001\uffff\u0001y\u0001\uffff\u0001o\u0002\uffff\u0001n\u0001\uffff\u0001u\u0002\uffff\u0001t\u0001$\u0001e\u0002$\u0001s\u0001c\u0001a\u0001e\u0003$\u0001\uffff\u0001$\u0001\uffff\u0001o\u0001l\u0001\uffff\u0001c\u0002e\u0001t\u0001$\u0001\uffff\u0001n\u0002\uffff\u0001$\u0001n\u0001$\u0001e\u0001$\u0001\uffff\u0001r\u0002\uffff\u0001$\u0001e\u0001c\u0001n\u0004\uffff\u0001n\u0001e\u0001t\u0002$\u0001e\u0001\uffff\u0001t\u0001\uffff\u0001$\u0001\uffff\u0001$\u0001\uffff\u0001$\u0001\uffff\u0001o\u0001e\u0001t\u0001i\u0002$\u0002\uffff\u0001d\u0001$\u0003\uffff\u0001f\u0001$\u0001s\u0001z\u0002\uffff\u0001$\u0001\uffff\u0001$\u0001\uffff\u0001$\u0001e\u0003\uffff\u0001d\u0001$\u0001\uffff");
        f14456x6 = C5581ck.m22927x1("\u0001\u3000\u0001u\u0001y\u0001u\u0001y\u0002o\u0001x\u0001n\u0001e\u0001y\u0001o\u0001i\u0001b\u0002o\u0001u\u0006\uffff\u00019\u0002\uffff\u0001=\u0001>\u0007=\u0001|\u0001=\u0003\uffff\u0001\uffff\u0003\uffff\u0001x\u0002\uffff\u0001l\u0001w\u0001t\u0001y\u0001r\u0001p\u0001l\u0001n\u0001r\u0001n\u0001o\u0001e\u0001o\u0002t\u0001n\u0002a\u0001l\u0001z\u0001s\u0001u\u0001t\u0002z\u0001p\u0001t\u0001i\u0001o\u0001a\u0001p\u0001n\u0001r\u0001l\u0001i\u0001t\u0001s\u0001t\u0001n\u0001c\u0001o\u0001b\u0002\uffff\u0001=\u0002\uffff\u0001>\u0001\uffff\u0001=\u0001\uffff\u0001=\u0013\uffff\u0001\uffff\u0006\uffff\u0001l\u0001z\u0001i\u0001e\u0001z\u0001n\u0001s\u0001o\u0001e\u0001s\u0001a\u0001z\u0001c\u0002a\u0001l\u0002e\u0001c\u0001t\u0001r\u0001s\u0001a\u0001e\u0001u\u0001b\u0001\uffff\u0001e\u0001m\u0001o\u0001e\u0001\uffff\u0001t\u0001z\u0001\uffff\u0001o\u0001u\u0001t\u0001r\u0001t\u0001e\u0001c\u0001z\u0001d\u0001a\u0001l\u0001h\u0001t\u0001o\u0001g\u0001k\u0001v\u0001t\u0001l\u0002\uffff\u0001=\u0007\uffff\u0001z\u0001\uffff\u0001v\u0001z\u0001\uffff\u0001s\u0001z\u0001w\u0001o\u0001e\u0001l\u0001\uffff\u0002t\u0001k\u0001e\u0002z\u0001h\u0001i\u0001t\u0001z\u0001s\u0001u\u0001t\u0001g\u0001l\u0002z\u0001r\u0001n\u0001a\u0001r\u0001\uffff\u0001e\u0002r\u0001c\u0001t\u0001i\u0001r\u0001h\u0001\uffff\u0001z\u0001t\u0001e\u0001z\u0001r\u0002z\u0002a\u0001e\u0001i\u0003\uffff\u0001e\u0001\uffff\u0001i\u0001\uffff\u0001z\u0001f\u0002z\u0001i\u0002z\u0001a\u0002\uffff\u0001z\u0001n\u0001z\u0001\uffff\u0001z\u0001l\u0001e\u0001g\u0001e\u0002\uffff\u0001t\u0001d\u0001n\u0001f\u0001m\u0001t\u0001n\u0001h\u0001z\u0001c\u0001z\u0001r\u0001\uffff\u0001i\u0001z\u0001\uffff\u0001a\u0002\uffff\u0001g\u0001t\u0002c\u0001z\u0001e\u0001z\u0001\uffff\u0001z\u0001\uffff\u0001y\u0001\uffff\u0001o\u0002\uffff\u0001n\u0001\uffff\u0001u\u0002\uffff\u0001t\u0001z\u0001e\u0002z\u0001s\u0001c\u0001a\u0001e\u0003z\u0001\uffff\u0001z\u0001\uffff\u0001o\u0001l\u0001\uffff\u0001c\u0002e\u0001t\u0001z\u0001\uffff\u0001n\u0002\uffff\u0001z\u0001n\u0001z\u0001e\u0001z\u0001\uffff\u0001r\u0002\uffff\u0001z\u0001e\u0001c\u0001n\u0004\uffff\u0001n\u0001e\u0001t\u0002z\u0001e\u0001\uffff\u0001t\u0001\uffff\u0001z\u0001\uffff\u0001z\u0001\uffff\u0001z\u0001\uffff\u0001o\u0001e\u0001t\u0001i\u0002z\u0002\uffff\u0001d\u0001z\u0003\uffff\u0001f\u0001z\u0001s\u0001z\u0002\uffff\u0001z\u0001\uffff\u0001z\u0001\uffff\u0001z\u0001e\u0003\uffff\u0001d\u0001z\u0001\uffff");
        f14452ne = C5581ck.m22926k4("\u0011\uffff\u0001<\u0001=\u0001>\u0001?\u0001@\u0001A\u0001\uffff\u0001C\u0001D\u000b\uffff\u0001Z\u0001]\u0001^\u0001\uffff\u0001l\u0001m\u0001p\u0001\uffff\u0001q\u0001t*\uffff\u0001B\u0001G\u0001\uffff\u0001E\u0001H\u0001\uffff\u0001F\u0001\uffff\u0001_\u0001\uffff\u0001Y\u0001Q\u0001`\u0001M\u0001R\u0001a\u0001N\u0001b\u0001O\u0001c\u0001P\u0001[\u0001g\u0001V\u0001\\\u0001h\u0001W\u0001i\u0001X\u0001\uffff\u0001n\u0001o\u0001j\u0001u\u0001s\u0001r\u001a\uffff\u0001\n\u0004\uffff\u0001\u000f\u0002\uffff\u0001\u0010\u0013\uffff\u0001d\u0001S\u0001\uffff\u0001e\u0001T\u0001K\u0001I\u0001L\u0001J\u0001k\u0001\uffff\u0001\u0012\u0002\uffff\u0001\u0017\u0006\uffff\u0001\r\u0015\uffff\u0001-\b\uffff\u0001\u0019\u000b\uffff\u0001f\u0001U\u0001\u0001\u0001\uffff\u0001\u0002\u0001\uffff\u0001\u0015\b\uffff\u0001\u001f\u0001\u0005\u0003\uffff\u0001 \u0005\uffff\u0001\u000b\u0001%\f\uffff\u0001\u001a\u0002\uffff\u0001\u001c\u0001\uffff\u0001*\u0001/\u0007\uffff\u0001\u0016\u0001\uffff\u0001\u0003\u0001\uffff\u0001(\u0001\uffff\u0001)\u0001\u0004\u0001\uffff\u0001\u0006\u0001\uffff\u0001\"\u0001!\f\uffff\u00015\u0001\uffff\u00017\u0002\uffff\u0001\u001b\u0005\uffff\u00010\u0001\uffff\u00019\u0001\u0018\u0005\uffff\u0001\t\u0001\uffff\u0001$\u0001&\u0004\uffff\u0001,\u0001\u0013\u0001\u0014\u00016\u0006\uffff\u00014\u0001\uffff\u0001\f\u0001\uffff\u0001\u001e\u0001\uffff\u0001\b\u0001\uffff\u0001'\u0006\uffff\u00011\u00012\u0002\uffff\u0001\u000e\u0001\u0007\u0001#\u0004\uffff\u0001;\u0001\u001d\u0001\uffff\u0001:\u0001\uffff\u0001.\u0002\uffff\u00013\u0001\u0011\u0001+\u0002\uffff\u00018");
        f14448ix = C5581ck.m22926k4("(\uffff\u0001\u0000M\uffff\u0001\u0001ę\uffff}>");
        int length2 = strArr2.length;
        f14454u4 = new short[length2][];
        for (int i2 = 0; i2 < length2; i2++) {
            f14454u4[i2] = C5581ck.m22926k4(f14455up[i2]);
        }
    }

    public C5445k4() {
        this.f14458kk = new k4(this);
        this.f14459to = new x1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: dx */
    public boolean m22273dx() {
        InterfaceC5591lr interfaceC5591lr = this.f14460uz;
        if (interfaceC5591lr == null) {
            return true;
        }
        int iMo22915k4 = interfaceC5591lr.mo22915k4();
        if (iMo22915k4 == 4 || iMo22915k4 == 5 || iMo22915k4 == 6 || iMo22915k4 == 24 || iMo22915k4 == 66 || iMo22915k4 == 68 || iMo22915k4 == 148 || iMo22915k4 == 149) {
            return false;
        }
        switch (iMo22915k4) {
        }
        return true;
    }

    /* JADX INFO: renamed from: kk */
    private boolean m22275kk(int i) {
        return C14117yj.m67535m9((char) i);
    }

    /* JADX INFO: renamed from: to */
    private boolean m22276to(int i) {
        return C14117yj.m67519h4((char) i);
    }

    /* JADX INFO: renamed from: v6 */
    private void m22277v6() throws C5598um {
        if (!m22276to(this.f15409x1.mo22951k4(1))) {
            throw new C5602wl();
        }
        m22963jd();
        while (true) {
            int iMo22951k4 = this.f15409x1.mo22951k4(1);
            if (iMo22951k4 != 36 && ((iMo22951k4 < 48 || iMo22951k4 > 57) && ((iMo22951k4 < 65 || iMo22951k4 > 90) && iMo22951k4 != 92 && iMo22951k4 != 95 && ((iMo22951k4 < 97 || iMo22951k4 > 122) && !m22275kk(iMo22951k4))))) {
                return;
            } else {
                m22349o3();
            }
        }
    }

    /* JADX INFO: renamed from: af */
    public final void m22278af() throws C5598um {
        m22972x1("<<");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 86;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: ai */
    public final void m22279ai() throws C5598um {
        m22972x1("native");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 51;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: ak */
    public final void m22280ak() throws C5598um {
        m22972x1("this");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 24;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: ar */
    public final void m22281ar() throws C5598um {
        m22972x1("for");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 16;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: av */
    public final void m22282av() throws C5598um {
        m22966k4(126);
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 93;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: b1 */
    public final void m22283b1() throws C5598um {
        m22972x1("<=");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 74;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: b3 */
    public final void m22284b3() throws C5598um {
        m22972x1("return");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 22;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: b5 */
    public final void m22285b5() throws C5598um {
        m22966k4(92);
    }

    /* JADX INFO: renamed from: bg */
    public final void m22286bg() throws C5598um {
        m22972x1("|=");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 107;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: bs */
    public final void m22287bs() throws C5598um {
        m22972x1("protected");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 54;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: bu */
    public final void m22288bu() throws C5598um {
        m22966k4(63);
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 96;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: bv */
    public final void m22289bv() throws C5598um {
        m22972x1("if");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 18;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: bz */
    public final void m22290bz() throws C5598um {
        m22972x1("while");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 30;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: c4 */
    public final void m22291c4() throws C5598um {
        m22966k4(94);
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 91;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: c6 */
    public final void m22292c6() throws C5598um {
        m22972x1("typeof");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 27;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: ca */
    public final void m22293ca() throws C5598um {
        m22972x1("private");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 53;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: cj */
    public final void m22294cj() throws C5598um {
        m22341n0();
        while (true) {
            int iMo22951k4 = this.f15409x1.mo22951k4(1);
            if (iMo22951k4 != 36 && ((iMo22951k4 < 48 || iMo22951k4 > 57) && ((iMo22951k4 < 65 || iMo22951k4 > 90) && iMo22951k4 != 92 && iMo22951k4 != 95 && ((iMo22951k4 < 97 || iMo22951k4 > 122) && !m22275kk(this.f15409x1.mo22951k4(1)))))) {
                return;
            } else {
                m22349o3();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX INFO: renamed from: cw */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m22295cw() throws C5598um {
        char c;
        int i;
        int iMo22951k4;
        String str;
        if (this.f15409x1.mo22951k4(1) != 48) {
            throw new C5602wl("", 20, 0, this.f15409x1);
        }
        int iMo22951k42 = this.f15409x1.mo22951k4(2);
        if (iMo22951k42 == 120) {
            c = 1;
        } else {
            if (iMo22951k42 != 88) {
                throw new C5602wl("", 20, 1, this.f15409x1);
            }
            c = 2;
        }
        if (c != 1) {
            str = c == 2 ? "0X" : "0x";
            i = 0;
            while (true) {
                iMo22951k4 = this.f15409x1.mo22951k4(1);
                if ((iMo22951k4 < 48 || iMo22951k4 > 57) && ((iMo22951k4 < 65 || iMo22951k4 > 70) && (iMo22951k4 < 97 || iMo22951k4 > 102))) {
                    break;
                }
                m22368sc();
                i++;
            }
            if (i >= 1) {
                throw new C5584fa(21, this.f15409x1);
            }
            C5579bv c5579bv = this.f15418k4;
            c5579bv.f15365yj = 161;
            c5579bv.f15363up = 0;
            return;
        }
        m22972x1(str);
        i = 0;
        while (true) {
            iMo22951k4 = this.f15409x1.mo22951k4(1);
            if (iMo22951k4 < 48) {
                break;
                break;
            }
            break;
            m22368sc();
            i++;
        }
        if (i >= 1) {
        }
    }

    /* JADX INFO: renamed from: d3 */
    public final void m22296d3() throws C5598um {
        m22966k4(47);
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 109;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: d4 */
    public final void m22297d4() throws C5598um {
        m22972x1("!==");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 79;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: dc */
    public final void m22298dc() throws C5598um {
        m22972x1("===");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 78;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: dl */
    public final void m22299dl() throws C5598um {
        m22972x1("+=");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 99;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: dq */
    public final void m22300dq() throws C5598um {
        m22972x1("throw");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 25;
        c5579bv.f15363up = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        r0 = r9.f15418k4;
        r0.f15365yj = 147;
        r0.f15363up = 99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: dt */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m22301dt() throws C5598um {
        m22972x1("//");
        while (true) {
            int iMo22951k4 = this.f15409x1.mo22951k4(1);
            if ((iMo22951k4 < 0 || iMo22951k4 > 9) && ((iMo22951k4 < 11 || iMo22951k4 > 12) && ((iMo22951k4 < 14 || iMo22951k4 > 8231) && (iMo22951k4 < 8234 || iMo22951k4 > 65535)))) {
                break;
            }
            if ((this.f15409x1.mo22951k4(1) < 0 || this.f15409x1.mo22951k4(1) > 9) && ((this.f15409x1.mo22951k4(1) < 11 || this.f15409x1.mo22951k4(1) > 12) && ((this.f15409x1.mo22951k4(1) < 14 || this.f15409x1.mo22951k4(1) > 8231) && (this.f15409x1.mo22951k4(1) < 8234 || this.f15409x1.mo22951k4(1) > 65535)))) {
                break;
            } else {
                this.f15409x1.mo22952k4();
            }
        }
        C5593ne c5593ne = new C5593ne(null, this.f15409x1);
        mo22969kk(c5593ne);
        throw c5593ne;
    }

    /* JADX INFO: renamed from: dw */
    public final void m22302dw() throws C5598um {
        m22972x1("<<=");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 103;
        c5579bv.f15363up = 0;
    }

    @Override // com.aspose.slides.internal.p217k4.AbstractC5590ks
    /* JADX INFO: renamed from: dy */
    public void mo22303dy() throws C5598um {
        switch (this.f14459to.m22928k4(this.f15409x1)) {
            case 1:
                m22311fa();
                break;
            case 2:
                m22383up();
                break;
            case 3:
                m22410yj();
                break;
            case 4:
                m22332ks();
                break;
            case 5:
                m22366rv();
                break;
            case 6:
                m22399x6();
                break;
            case 7:
                m22344ne();
                break;
            case 8:
                m22323ix();
                break;
            case 9:
                m22380u4();
                break;
            case 10:
                m22385uz();
                break;
            case 11:
                m22392wl();
                break;
            case 12:
                m22359qq();
                break;
            case 13:
                m22281ar();
                break;
            case 14:
                m22382um();
                break;
            case 15:
                m22289bv();
                break;
            case 16:
                m22386v4();
                break;
            case 17:
                m22335lr();
                break;
            case 18:
                m22408yd();
                break;
            case 19:
                m22284b3();
                break;
            case 20:
                m22395wy();
                break;
            case 21:
                m22280ak();
                break;
            case 22:
                m22300dq();
                break;
            case 23:
                m22402xk();
                break;
            case 24:
                m22292c6();
                break;
            case 25:
                m22377ts();
                break;
            case 26:
                m22304e0();
                break;
            case 27:
                m22290bz();
                break;
            case 28:
                m22357qm();
                break;
            case 29:
                m22312g8();
                break;
            case 30:
                m22372sv();
                break;
            case 31:
                m22393wp();
                break;
            case 32:
                m22371ss();
                break;
            case 33:
                m22331kp();
                break;
            case 34:
                m22315gi();
                break;
            case 35:
                m22367s7();
                break;
            case 36:
                m22310f9();
                break;
            case 37:
                m22374t6();
                break;
            case 38:
                m22403xw();
                break;
            case 39:
                m22388vj();
                break;
            case 40:
                m22387vh();
                break;
            case 41:
                m22360qw();
                break;
            case 42:
                m22376tq();
                break;
            case 43:
                m22324j2();
                break;
            case 44:
                m22391w6();
                break;
            case 45:
                m22351os();
                break;
            case 46:
                m22307em();
                break;
            case 47:
                m22419zj();
                break;
            case 48:
                m22279ai();
                break;
            case 49:
                m22363ri();
                break;
            case 50:
                m22293ca();
                break;
            case 51:
                m22287bs();
                break;
            case 52:
                m22318he();
                break;
            case 53:
                m22328jw();
                break;
            case 54:
                m22404y2();
                break;
            case 55:
                m22338m4();
                break;
            case 56:
                m22337m2();
                break;
            case 57:
                m22325j5();
                break;
            case 58:
                m22347nv();
                break;
            case 59:
                m22407y9();
                break;
            case 60:
                m22314gf();
                break;
            case 61:
                m22321ig();
                break;
            case 62:
                m22316gk();
                break;
            case 63:
                m22398x5();
                break;
            case 64:
                m22412yo();
                break;
            case 65:
                m22343na();
                break;
            case 66:
                m22396wz();
                break;
            case 67:
                m22379u1();
                break;
            case 68:
                m22411yn();
                break;
            case 69:
                m22409yg();
                break;
            case 70:
                m22340my();
                break;
            case 71:
                m22283b1();
                break;
            case 72:
                m22413yw();
                break;
            case 73:
                m22420zm();
                break;
            case 74:
                m22322ii();
                break;
            case 75:
                m22298dc();
                break;
            case 76:
                m22297d4();
                break;
            case 77:
                m22405y4();
                break;
            case 78:
                m22390vw();
                break;
            case 79:
                m22389vt();
                break;
            case 80:
                m22358qn();
                break;
            case 81:
                m22356qk();
                break;
            case 82:
                m22364rq();
                break;
            case 83:
                m22278af();
                break;
            case 84:
                m22397x3();
                break;
            case 85:
                m22370sq();
                break;
            case 86:
                m22381u5();
                break;
            case 87:
                m22334lm();
                break;
            case 88:
                m22291c4();
                break;
            case 89:
                m22326jf();
                break;
            case 90:
                m22282av();
                break;
            case 91:
                m22352ou();
                break;
            case 92:
                m22401xi();
                break;
            case 93:
                m22288bu();
                break;
            case 94:
                m22345nh();
                break;
            case 95:
                m22350o9();
                break;
            case 96:
                m22299dl();
                break;
            case 97:
                m22309f7();
                break;
            case 98:
                m22336ly();
                break;
            case 99:
                m22355q6();
                break;
            case 100:
                m22302dw();
                break;
            case 101:
                m22375tl();
                break;
            case 102:
                m22354q3();
                break;
            case 103:
                m22305e8();
                break;
            case 104:
                m22286bg();
                break;
            case 105:
                m22330k5();
                break;
            case 106:
                m22296d3();
                break;
            case 107:
                m22308ew();
                break;
            case 108:
                m22342n3();
                break;
            case 109:
                m22406y6();
                break;
            case 110:
                m22327jm();
                break;
            case 111:
                m22301dt();
                break;
            case 112:
                m22313ga();
                break;
            case 113:
                m22369so();
                break;
            case 114:
                m22333li();
                break;
            case 115:
                m22295cw();
                break;
            case 116:
                m22361r5();
                break;
            case 117:
                m22414z1();
                break;
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m22304e0() throws C5598um {
        m22972x1("void");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 29;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: e8 */
    public final void m22305e8() throws C5598um {
        m22972x1("&=");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 106;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: ei */
    public final void m22306ei() throws C5598um {
        m22966k4(117);
        m22368sc();
        m22368sc();
        m22368sc();
        m22368sc();
    }

    /* JADX INFO: renamed from: em */
    public final void m22307em() throws C5598um {
        m22972x1("interface");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 49;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: ew */
    public final void m22308ew() throws C5598um {
        m22972x1("/=");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 110;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: f7 */
    public final void m22309f7() throws C5598um {
        m22972x1("-=");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 100;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: f9 */
    public final void m22310f9() throws C5598um {
        m22972x1("double");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 39;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: fa */
    public final void m22311fa() throws C5598um {
        m22972x1(CloudMetaExtra.DEFINE_NON_PARENT_ID);
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 4;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: g8 */
    public final void m22312g8() throws C5598um {
        m22972x1("abstract");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 32;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: ga */
    public final void m22313ga() throws C5598um {
        int iMo22951k4 = this.f15409x1.mo22951k4(1);
        char c = (iMo22951k4 == 36 || (iMo22951k4 >= 65 && iMo22951k4 <= 90) || iMo22951k4 == 92 || iMo22951k4 == 95 || (iMo22951k4 >= 97 && iMo22951k4 <= 122)) ? (char) 1 : (char) 2;
        if (c == 1) {
            m22294cj();
        } else if (c == 2) {
            m22277v6();
        }
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 148;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: gf */
    public final void m22314gf() throws C5598um {
        m22966k4(123);
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 63;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: gi */
    public final void m22315gi() throws C5598um {
        m22972x1("const");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 37;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: gk */
    public final void m22316gk() throws C5598um {
        m22966k4(40);
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 65;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: gx */
    public final void m22317gx() throws C5598um {
        char c;
        int iMo22951k4 = this.f15409x1.mo22951k4(1);
        if ((iMo22951k4 >= 0 && iMo22951k4 <= 9) || ((iMo22951k4 >= 11 && iMo22951k4 <= 12) || ((iMo22951k4 >= 14 && iMo22951k4 <= 46) || ((iMo22951k4 >= 48 && iMo22951k4 <= 91) || ((iMo22951k4 >= 93 && iMo22951k4 <= 8231) || (iMo22951k4 >= 8234 && iMo22951k4 <= 65535)))))) {
            c = 1;
        } else {
            if (iMo22951k4 != 92) {
                throw new C5602wl("", 29, 0, this.f15409x1);
            }
            c = 2;
        }
        if (c != 1) {
            if (c != 2) {
                return;
            }
            m22348nx();
            return;
        }
        if ((this.f15409x1.mo22951k4(1) >= 0 && this.f15409x1.mo22951k4(1) <= 9) || ((this.f15409x1.mo22951k4(1) >= 11 && this.f15409x1.mo22951k4(1) <= 12) || ((this.f15409x1.mo22951k4(1) >= 14 && this.f15409x1.mo22951k4(1) <= 46) || ((this.f15409x1.mo22951k4(1) >= 48 && this.f15409x1.mo22951k4(1) <= 91) || ((this.f15409x1.mo22951k4(1) >= 93 && this.f15409x1.mo22951k4(1) <= 8231) || (this.f15409x1.mo22951k4(1) >= 8234 && this.f15409x1.mo22951k4(1) <= 65535)))))) {
            this.f15409x1.mo22952k4();
        } else {
            C5593ne c5593ne = new C5593ne(null, this.f15409x1);
            mo22969kk(c5593ne);
            throw c5593ne;
        }
    }

    /* JADX INFO: renamed from: he */
    public final void m22318he() throws C5598um {
        m22972x1("public");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 55;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: hq */
    public final void m22319hq() throws C5598um {
        m22967k4(48, 55);
    }

    /* JADX INFO: renamed from: i5 */
    public final void m22320i5() throws C5598um {
        char c;
        int iMo22951k4 = this.f15409x1.mo22951k4(1);
        if ((iMo22951k4 >= 0 && iMo22951k4 <= 9) || ((iMo22951k4 >= 11 && iMo22951k4 <= 12) || ((iMo22951k4 >= 14 && iMo22951k4 <= 41) || ((iMo22951k4 >= 43 && iMo22951k4 <= 46) || ((iMo22951k4 >= 48 && iMo22951k4 <= 91) || ((iMo22951k4 >= 93 && iMo22951k4 <= 8231) || (iMo22951k4 >= 8234 && iMo22951k4 <= 65535))))))) {
            c = 1;
        } else {
            if (iMo22951k4 != 92) {
                throw new C5602wl("", 28, 0, this.f15409x1);
            }
            c = 2;
        }
        if (c != 1) {
            if (c != 2) {
                return;
            }
            m22348nx();
            return;
        }
        if ((this.f15409x1.mo22951k4(1) >= 0 && this.f15409x1.mo22951k4(1) <= 9) || ((this.f15409x1.mo22951k4(1) >= 11 && this.f15409x1.mo22951k4(1) <= 12) || ((this.f15409x1.mo22951k4(1) >= 14 && this.f15409x1.mo22951k4(1) <= 41) || ((this.f15409x1.mo22951k4(1) >= 43 && this.f15409x1.mo22951k4(1) <= 46) || ((this.f15409x1.mo22951k4(1) >= 48 && this.f15409x1.mo22951k4(1) <= 91) || ((this.f15409x1.mo22951k4(1) >= 93 && this.f15409x1.mo22951k4(1) <= 8231) || (this.f15409x1.mo22951k4(1) >= 8234 && this.f15409x1.mo22951k4(1) <= 65535))))))) {
            this.f15409x1.mo22952k4();
        } else {
            C5593ne c5593ne = new C5593ne(null, this.f15409x1);
            mo22969kk(c5593ne);
            throw c5593ne;
        }
    }

    /* JADX INFO: renamed from: ig */
    public final void m22321ig() throws C5598um {
        m22966k4(125);
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 64;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: ii */
    public final void m22322ii() throws C5598um {
        m22972x1("!=");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 77;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: ix */
    public final void m22323ix() throws C5598um {
        m22972x1("default");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 11;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: j2 */
    public final void m22324j2() throws C5598um {
        m22972x1("implements");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 46;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: j5 */
    public final void m22325j5() throws C5598um {
        m22972x1("throws");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 60;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: jf */
    public final void m22326jf() throws C5598um {
        m22966k4(33);
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 92;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: jm */
    public final void m22327jm() throws C5598um {
        m22972x1("/*");
        while (true) {
            int iMo22951k4 = this.f15409x1.mo22951k4(1);
            if (iMo22951k4 == 42) {
                int iMo22951k42 = this.f15409x1.mo22951k4(2);
                if (iMo22951k42 == 47 || ((iMo22951k42 < 0 || iMo22951k42 > 46) && (iMo22951k42 < 48 || iMo22951k42 > 65535))) {
                    break;
                } else {
                    m22963jd();
                }
            } else if ((iMo22951k4 < 0 || iMo22951k4 > 41) && (iMo22951k4 < 43 || iMo22951k4 > 65535)) {
                break;
            } else {
                m22963jd();
            }
        }
        m22972x1("*/");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 146;
        c5579bv.f15363up = 99;
    }

    /* JADX INFO: renamed from: jw */
    public final void m22328jw() throws C5598um {
        m22972x1("short");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 56;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: k1 */
    public final void m22329k1() throws C5598um {
        m22966k4(13);
    }

    /* JADX INFO: renamed from: k5 */
    public final void m22330k5() throws C5598um {
        m22972x1("^=");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 108;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: kp */
    public final void m22331kp() throws C5598um {
        m22972x1("class");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 36;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: ks */
    public final void m22332ks() throws C5598um {
        m22972x1("break");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 7;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: li */
    public final void m22333li() throws C5598um {
        m22966k4(48);
        int i = 0;
        while (true) {
            int iMo22951k4 = this.f15409x1.mo22951k4(1);
            if (iMo22951k4 < 48 || iMo22951k4 > 55) {
                break;
            }
            m22319hq();
            i++;
        }
        if (i < 1) {
            throw new C5584fa(19, this.f15409x1);
        }
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 160;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: lm */
    public final void m22334lm() throws C5598um {
        m22966k4(124);
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 90;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: lr */
    public final void m22335lr() throws C5598um {
        m22972x1("instanceof");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 20;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: ly */
    public final void m22336ly() throws C5598um {
        m22972x1("*=");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 101;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: m2 */
    public final void m22337m2() throws C5598um {
        m22972x1("synchronized");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 59;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: m4 */
    public final void m22338m4() throws C5598um {
        m22972x1("super");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 58;
        c5579bv.f15363up = 0;
    }

    @Override // com.aspose.slides.internal.p217k4.AbstractC5590ks, com.aspose.slides.internal.p217k4.InterfaceC5606yd
    /* JADX INFO: renamed from: m9 */
    public InterfaceC5591lr mo22339m9() {
        InterfaceC5591lr interfaceC5591lrMo22339m9 = super.mo22339m9();
        if (interfaceC5591lrMo22339m9.mo22912du() == 0) {
            this.f14460uz = interfaceC5591lrMo22339m9;
        }
        return interfaceC5591lrMo22339m9;
    }

    /* JADX INFO: renamed from: my */
    public final void m22340my() throws C5598um {
        m22966k4(62);
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 73;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m22341n0() throws C5598um {
        char c;
        int iMo22951k4 = this.f15409x1.mo22951k4(1);
        if (iMo22951k4 == 36) {
            c = 3;
        } else if (iMo22951k4 == 92) {
            c = 5;
        } else if (iMo22951k4 != 95) {
            switch (iMo22951k4) {
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                    c = 2;
                    break;
                default:
                    switch (iMo22951k4) {
                        case 97:
                        case 98:
                        case 99:
                        case 100:
                        case 101:
                        case 102:
                        case 103:
                        case 104:
                        case 105:
                        case 106:
                        case 107:
                        case 108:
                        case 109:
                        case 110:
                        case 111:
                        case 112:
                        case 113:
                        case 114:
                        case 115:
                        case 116:
                        case 117:
                        case 118:
                        case 119:
                        case 120:
                        case 121:
                        case 122:
                            c = 1;
                            break;
                        default:
                            throw new C5602wl("", 5, 0, this.f15409x1);
                    }
                    break;
            }
        } else {
            c = 4;
        }
        if (c == 1) {
            m22967k4(97, 122);
            return;
        }
        if (c == 2) {
            m22967k4(65, 90);
            return;
        }
        if (c == 3) {
            m22966k4(36);
            return;
        }
        if (c == 4) {
            m22966k4(95);
            return;
        }
        if (c != 5) {
            return;
        }
        m22285b5();
        m22966k4(117);
        m22368sc();
        m22368sc();
        m22368sc();
        m22368sc();
    }

    /* JADX INFO: renamed from: n3 */
    public final void m22342n3() throws C5598um {
        int i = 0;
        while (true) {
            int iMo22951k4 = this.f15409x1.mo22951k4(1);
            if (iMo22951k4 != 9 && ((iMo22951k4 < 11 || iMo22951k4 > 12) && iMo22951k4 != 32 && iMo22951k4 != 160 && iMo22951k4 != 5760 && iMo22951k4 != 6158 && ((iMo22951k4 < 8192 || iMo22951k4 > 8202) && iMo22951k4 != 8239 && iMo22951k4 != 8287 && iMo22951k4 != 12288))) {
                if (i < 1) {
                    throw new C5584fa(1, this.f15409x1);
                }
                C5579bv c5579bv = this.f15418k4;
                c5579bv.f15365yj = 139;
                c5579bv.f15363up = 99;
                return;
            }
            if (this.f15409x1.mo22951k4(1) != 9 && ((this.f15409x1.mo22951k4(1) < 11 || this.f15409x1.mo22951k4(1) > 12) && this.f15409x1.mo22951k4(1) != 32 && this.f15409x1.mo22951k4(1) != 160 && this.f15409x1.mo22951k4(1) != 5760 && this.f15409x1.mo22951k4(1) != 6158 && ((this.f15409x1.mo22951k4(1) < 8192 || this.f15409x1.mo22951k4(1) > 8202) && this.f15409x1.mo22951k4(1) != 8239 && this.f15409x1.mo22951k4(1) != 8287 && this.f15409x1.mo22951k4(1) != 12288))) {
                C5593ne c5593ne = new C5593ne(null, this.f15409x1);
                mo22969kk(c5593ne);
                throw c5593ne;
            }
            this.f15409x1.mo22952k4();
            i++;
        }
    }

    /* JADX INFO: renamed from: na */
    public final void m22343na() throws C5598um {
        m22966k4(93);
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 68;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: ne */
    public final void m22344ne() throws C5598um {
        m22972x1("continue");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 10;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: nh */
    public final void m22345nh() throws C5598um {
        m22966k4(58);
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 97;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: nk */
    public final void m22346nk() throws C5598um {
        m22966k4(39);
    }

    /* JADX INFO: renamed from: nv */
    public final void m22347nv() throws C5598um {
        m22972x1("transient");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 61;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: nx */
    public final void m22348nx() throws C5598um {
        m22285b5();
        if ((this.f15409x1.mo22951k4(1) >= 0 && this.f15409x1.mo22951k4(1) <= 9) || ((this.f15409x1.mo22951k4(1) >= 11 && this.f15409x1.mo22951k4(1) <= 12) || ((this.f15409x1.mo22951k4(1) >= 14 && this.f15409x1.mo22951k4(1) <= 8231) || (this.f15409x1.mo22951k4(1) >= 8234 && this.f15409x1.mo22951k4(1) <= 65535)))) {
            this.f15409x1.mo22952k4();
        } else {
            C5593ne c5593ne = new C5593ne(null, this.f15409x1);
            mo22969kk(c5593ne);
            throw c5593ne;
        }
    }

    /* JADX INFO: renamed from: o3 */
    public final void m22349o3() throws C5598um {
        char c;
        int iMo22951k4 = this.f15409x1.mo22951k4(1);
        if (iMo22951k4 != 36 && iMo22951k4 != 92 && iMo22951k4 != 95) {
            switch (iMo22951k4) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    c = 1;
                    break;
                default:
                    switch (iMo22951k4) {
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                        case 76:
                        case 77:
                        case 78:
                        case 79:
                        case 80:
                        case 81:
                        case 82:
                        case 83:
                        case 84:
                        case 85:
                        case 86:
                        case 87:
                        case 88:
                        case 89:
                        case 90:
                            c = 2;
                            break;
                        default:
                            switch (iMo22951k4) {
                                case 97:
                                case 98:
                                case 99:
                                case 100:
                                case 101:
                                case 102:
                                case 103:
                                case 104:
                                case 105:
                                case 106:
                                case 107:
                                case 108:
                                case 109:
                                case 110:
                                case 111:
                                case 112:
                                case 113:
                                case 114:
                                case 115:
                                case 116:
                                case 117:
                                case 118:
                                case 119:
                                case 120:
                                case 121:
                                case 122:
                                    c = 2;
                                    break;
                                default:
                                    c = 3;
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            c = 2;
        }
        if (c == 1) {
            m22373sz();
            return;
        }
        if (c == 2) {
            m22341n0();
        } else {
            if (c != 3) {
                return;
            }
            if (!m22275kk(this.f15409x1.mo22951k4(1))) {
                throw new C5599up(this.f15409x1, "IdentifierPart", " isIdentifierPartUnicode(input.LA(1)) ");
            }
            m22963jd();
        }
    }

    /* JADX INFO: renamed from: o9 */
    public final void m22350o9() throws C5598um {
        m22966k4(61);
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 98;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: os */
    public final void m22351os() throws C5598um {
        m22972x1("int");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 48;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: ou */
    public final void m22352ou() throws C5598um {
        m22972x1("&&");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 94;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: ph */
    public final void m22353ph() throws C5598um {
        m22966k4(120);
        m22368sc();
        m22368sc();
    }

    /* JADX INFO: renamed from: q3 */
    public final void m22354q3() throws C5598um {
        m22972x1(">>>=");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 105;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: q6 */
    public final void m22355q6() throws C5598um {
        m22972x1("%=");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 102;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: qk */
    public final void m22356qk() throws C5598um {
        m22972x1("++");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 84;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: qm */
    public final void m22357qm() throws C5598um {
        m22972x1("with");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 31;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: qn */
    public final void m22358qn() throws C5598um {
        m22966k4(37);
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 83;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: qq */
    public final void m22359qq() throws C5598um {
        m22972x1("finally");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 15;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: qw */
    public final void m22360qw() throws C5598um {
        m22972x1("float");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 44;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: r5 */
    public final void m22361r5() throws C5598um {
        char c;
        int iMo22951k4 = this.f15409x1.mo22951k4(1);
        if (iMo22951k4 == 39) {
            c = 1;
        } else {
            if (iMo22951k4 != 34) {
                throw new C5602wl("", 27, 0, this.f15409x1);
            }
            c = 2;
        }
        if (c == 1) {
            m22346nk();
            while (true) {
                int iMo22951k42 = this.f15409x1.mo22951k4(1);
                char c2 = ((iMo22951k42 < 0 || iMo22951k42 > 9) && (iMo22951k42 < 11 || iMo22951k42 > 12) && ((iMo22951k42 < 14 || iMo22951k42 > 38) && ((iMo22951k42 < 40 || iMo22951k42 > 91) && ((iMo22951k42 < 93 || iMo22951k42 > 8231) && (iMo22951k42 < 8234 || iMo22951k42 > 65535))))) ? iMo22951k42 == 92 ? (char) 2 : (char) 3 : (char) 1;
                if (c2 != 1) {
                    if (c2 != 2) {
                        m22346nk();
                        break;
                    }
                    m22418zf();
                } else if ((this.f15409x1.mo22951k4(1) < 0 || this.f15409x1.mo22951k4(1) > 9) && ((this.f15409x1.mo22951k4(1) < 11 || this.f15409x1.mo22951k4(1) > 12) && ((this.f15409x1.mo22951k4(1) < 14 || this.f15409x1.mo22951k4(1) > 38) && ((this.f15409x1.mo22951k4(1) < 40 || this.f15409x1.mo22951k4(1) > 91) && ((this.f15409x1.mo22951k4(1) < 93 || this.f15409x1.mo22951k4(1) > 8231) && (this.f15409x1.mo22951k4(1) < 8234 || this.f15409x1.mo22951k4(1) > 65535)))))) {
                    break;
                } else {
                    this.f15409x1.mo22952k4();
                }
            }
            C5593ne c5593ne = new C5593ne(null, this.f15409x1);
            mo22969kk(c5593ne);
            throw c5593ne;
        }
        if (c == 2) {
            m22362r7();
            while (true) {
                int iMo22951k43 = this.f15409x1.mo22951k4(1);
                char c3 = ((iMo22951k43 < 0 || iMo22951k43 > 9) && (iMo22951k43 < 11 || iMo22951k43 > 12) && ((iMo22951k43 < 14 || iMo22951k43 > 33) && ((iMo22951k43 < 35 || iMo22951k43 > 91) && ((iMo22951k43 < 93 || iMo22951k43 > 8231) && (iMo22951k43 < 8234 || iMo22951k43 > 65535))))) ? iMo22951k43 == 92 ? (char) 2 : (char) 3 : (char) 1;
                if (c3 != 1) {
                    if (c3 != 2) {
                        m22362r7();
                        break;
                    }
                    m22418zf();
                } else if ((this.f15409x1.mo22951k4(1) < 0 || this.f15409x1.mo22951k4(1) > 9) && ((this.f15409x1.mo22951k4(1) < 11 || this.f15409x1.mo22951k4(1) > 12) && ((this.f15409x1.mo22951k4(1) < 14 || this.f15409x1.mo22951k4(1) > 33) && ((this.f15409x1.mo22951k4(1) < 35 || this.f15409x1.mo22951k4(1) > 91) && ((this.f15409x1.mo22951k4(1) < 93 || this.f15409x1.mo22951k4(1) > 8231) && (this.f15409x1.mo22951k4(1) < 8234 || this.f15409x1.mo22951k4(1) > 65535)))))) {
                    break;
                } else {
                    this.f15409x1.mo22952k4();
                }
            }
            C5593ne c5593ne2 = new C5593ne(null, this.f15409x1);
            mo22969kk(c5593ne2);
            throw c5593ne2;
        }
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 149;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: r7 */
    public final void m22362r7() throws C5598um {
        m22966k4(34);
    }

    /* JADX INFO: renamed from: ri */
    public final void m22363ri() throws C5598um {
        m22972x1("package");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 52;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: rq */
    public final void m22364rq() throws C5598um {
        m22972x1("--");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 85;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: rs */
    public final void m22365rs() throws C5598um {
        char c;
        int iMo22951k4 = this.f15409x1.mo22951k4(1);
        if (iMo22951k4 == 48) {
            c = 1;
        } else {
            if (iMo22951k4 < 49 || iMo22951k4 > 57) {
                throw new C5602wl("", 12, 0, this.f15409x1);
            }
            c = 2;
        }
        if (c == 1) {
            m22966k4(48);
            return;
        }
        if (c != 2) {
            return;
        }
        m22967k4(49, 57);
        while (true) {
            int iMo22951k42 = this.f15409x1.mo22951k4(1);
            if (iMo22951k42 < 48 || iMo22951k42 > 57) {
                return;
            } else {
                m22373sz();
            }
        }
    }

    /* JADX INFO: renamed from: rv */
    public final void m22366rv() throws C5598um {
        m22972x1("case");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 8;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: s7 */
    public final void m22367s7() throws C5598um {
        m22972x1("debugger");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 38;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: sc */
    public final void m22368sc() throws C5598um {
        if ((this.f15409x1.mo22951k4(1) >= 48 && this.f15409x1.mo22951k4(1) <= 57) || ((this.f15409x1.mo22951k4(1) >= 65 && this.f15409x1.mo22951k4(1) <= 70) || (this.f15409x1.mo22951k4(1) >= 97 && this.f15409x1.mo22951k4(1) <= 102))) {
            this.f15409x1.mo22952k4();
        } else {
            C5593ne c5593ne = new C5593ne(null, this.f15409x1);
            mo22969kk(c5593ne);
            throw c5593ne;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX INFO: renamed from: so */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m22369so() throws C5598um {
        int iM22928k4 = this.f14458kk.m22928k4(this.f15409x1);
        if (iM22928k4 == 1) {
            m22365rs();
            m22966k4(46);
            while (true) {
                int iMo22951k4 = this.f15409x1.mo22951k4(1);
                if (iMo22951k4 < 48 || iMo22951k4 > 57) {
                    break;
                } else {
                    m22373sz();
                }
            }
            int iMo22951k42 = this.f15409x1.mo22951k4(1);
            if (iMo22951k42 == 69 || iMo22951k42 == 101) {
            }
        } else if (iM22928k4 == 2) {
            m22966k4(46);
            int i = 0;
            while (true) {
                int iMo22951k43 = this.f15409x1.mo22951k4(1);
                if (iMo22951k43 < 48 || iMo22951k43 > 57) {
                    break;
                }
                m22373sz();
                i++;
            }
            if (i < 1) {
                throw new C5584fa(15, this.f15409x1);
            }
            int iMo22951k44 = this.f15409x1.mo22951k4(1);
            if (iMo22951k44 == 69 || iMo22951k44 == 101) {
            }
        } else if (iM22928k4 == 3) {
            m22365rs();
            int iMo22951k45 = this.f15409x1.mo22951k4(1);
            if (iMo22951k45 == 69 || iMo22951k45 == 101) {
                m22415z7();
            }
        }
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 159;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: sq */
    public final void m22370sq() throws C5598um {
        m22972x1(">>>");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 88;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: ss */
    public final void m22371ss() throws C5598um {
        m22972x1("char");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 35;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: sv */
    public final void m22372sv() throws C5598um {
        m22972x1("boolean");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 33;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: sz */
    public final void m22373sz() throws C5598um {
        m22967k4(48, 57);
    }

    /* JADX INFO: renamed from: t6 */
    public final void m22374t6() throws C5598um {
        m22972x1("enum");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 40;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: tl */
    public final void m22375tl() throws C5598um {
        m22972x1(">>=");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 104;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: tq */
    public final void m22376tq() throws C5598um {
        m22972x1("goto");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 45;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: ts */
    public final void m22377ts() throws C5598um {
        m22972x1("var");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 28;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: tw */
    public final void m22378tw() throws C5598um {
        m22966k4(8233);
    }

    /* JADX INFO: renamed from: u1 */
    public final void m22379u1() throws C5598um {
        m22966k4(59);
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 70;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: u4 */
    public final void m22380u4() throws C5598um {
        m22972x1(RequestParameters.SUBRESOURCE_DELETE);
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 12;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: u5 */
    public final void m22381u5() throws C5598um {
        m22966k4(38);
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 89;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: um */
    public final void m22382um() throws C5598um {
        m22972x1("function");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 17;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: up */
    public final void m22383up() throws C5598um {
        m22972x1(TelemetryEventStrings.Value.TRUE);
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 5;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: uw */
    public final void m22384uw() throws C5598um {
        m22967k4(48, 51);
    }

    /* JADX INFO: renamed from: uz */
    public final void m22385uz() throws C5598um {
        m22972x1("do");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 13;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: v4 */
    public final void m22386v4() throws C5598um {
        m22972x1(BackupFile.EXTENSION_NOTEIN_FILE);
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 19;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: vh */
    public final void m22387vh() throws C5598um {
        m22972x1("final");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 43;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: vj */
    public final void m22388vj() throws C5598um {
        m22972x1("extends");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 42;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: vt */
    public final void m22389vt() throws C5598um {
        m22966k4(42);
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 82;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: vw */
    public final void m22390vw() throws C5598um {
        m22966k4(45);
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 81;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: w6 */
    public final void m22391w6() throws C5598um {
        m22972x1("import");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 47;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: wl */
    public final void m22392wl() throws C5598um {
        m22972x1("else");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 14;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: wp */
    public final void m22393wp() throws C5598um {
        m22972x1("byte");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 34;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: wt */
    public final void m22394wt() throws C5598um {
        m22966k4(8232);
    }

    /* JADX INFO: renamed from: wy */
    public final void m22395wy() throws C5598um {
        m22972x1("switch");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 23;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: wz */
    public final void m22396wz() throws C5598um {
        m22966k4(46);
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 69;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: x3 */
    public final void m22397x3() throws C5598um {
        m22972x1(">>");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 87;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: x5 */
    public final void m22398x5() throws C5598um {
        m22966k4(41);
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 66;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: x6 */
    public final void m22399x6() throws C5598um {
        m22972x1("catch");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 9;
        c5579bv.f15363up = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX INFO: renamed from: xb */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m22400xb() throws C5598um {
        char c;
        int iMo22951k4 = this.f15409x1.mo22951k4(1);
        if (iMo22951k4 >= 48 && iMo22951k4 <= 51) {
            int iMo22951k42 = this.f15409x1.mo22951k4(2);
            if (iMo22951k42 >= 48 && iMo22951k42 <= 55) {
                int iMo22951k43 = this.f15409x1.mo22951k4(3);
                c = (iMo22951k43 < 48 || iMo22951k43 > 55) ? (char) 2 : (char) 4;
            }
        } else {
            if (iMo22951k4 < 52 || iMo22951k4 > 55) {
                throw new C5602wl("", 22, 0, this.f15409x1);
            }
            int iMo22951k44 = this.f15409x1.mo22951k4(2);
            c = (iMo22951k44 < 48 || iMo22951k44 > 55) ? (char) 1 : (char) 3;
        }
        if (c == 1) {
            m22319hq();
            return;
        }
        if (c == 2) {
            m22384uw();
        } else if (c == 3) {
            m22967k4(52, 55);
        } else {
            if (c != 4) {
                return;
            }
            m22384uw();
            m22319hq();
        }
        m22319hq();
    }

    /* JADX INFO: renamed from: xi */
    public final void m22401xi() throws C5598um {
        m22972x1("||");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 95;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: xk */
    public final void m22402xk() throws C5598um {
        m22972x1("try");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 26;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: xw */
    public final void m22403xw() throws C5598um {
        m22972x1("export");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 41;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: y2 */
    public final void m22404y2() throws C5598um {
        m22972x1("static");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 57;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: y4 */
    public final void m22405y4() throws C5598um {
        m22966k4(43);
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 80;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: y6 */
    public final void m22406y6() throws C5598um {
        char c;
        int iMo22951k4 = this.f15409x1.mo22951k4(1);
        if (iMo22951k4 == 10) {
            c = 2;
        } else if (iMo22951k4 == 13) {
            c = 1;
        } else if (iMo22951k4 == 8232) {
            c = 3;
        } else {
            if (iMo22951k4 != 8233) {
                throw new C5602wl("", 2, 0, this.f15409x1);
            }
            c = 4;
        }
        if (c != 1) {
            if (c != 2) {
                if (c == 3) {
                    m22394wt();
                } else if (c == 4) {
                    m22378tw();
                }
            }
            C5579bv c5579bv = this.f15418k4;
            c5579bv.f15365yj = 145;
            c5579bv.f15363up = 99;
        }
        m22329k1();
        m22416zd();
        C5579bv c5579bv2 = this.f15418k4;
        c5579bv2.f15365yj = 145;
        c5579bv2.f15363up = 99;
    }

    /* JADX INFO: renamed from: y9 */
    public final void m22407y9() throws C5598um {
        m22972x1("volatile");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 62;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: yd */
    public final void m22408yd() throws C5598um {
        m22972x1("new");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 21;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: yg */
    public final void m22409yg() throws C5598um {
        m22966k4(60);
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 72;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: yj */
    public final void m22410yj() throws C5598um {
        m22972x1(TelemetryEventStrings.Value.FALSE);
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 6;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: yn */
    public final void m22411yn() throws C5598um {
        m22966k4(44);
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 71;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: yo */
    public final void m22412yo() throws C5598um {
        m22966k4(91);
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 67;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: yw */
    public final void m22413yw() throws C5598um {
        m22972x1(">=");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 75;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: z1 */
    public final void m22414z1() throws C5598um {
        if (!m22273dx()) {
            throw new C5599up(this.f15409x1, "RegularExpressionLiteral", " areRegularExpressionsEnabled() ");
        }
        m22296d3();
        m22320i5();
        while (true) {
            int iMo22951k4 = this.f15409x1.mo22951k4(1);
            if ((iMo22951k4 < 0 || iMo22951k4 > 9) && ((iMo22951k4 < 11 || iMo22951k4 > 12) && ((iMo22951k4 < 14 || iMo22951k4 > 46) && ((iMo22951k4 < 48 || iMo22951k4 > 8231) && (iMo22951k4 < 8234 || iMo22951k4 > 65535))))) {
                break;
            } else {
                m22317gx();
            }
        }
        m22296d3();
        while (true) {
            int iMo22951k42 = this.f15409x1.mo22951k4(1);
            if (iMo22951k42 != 36 && ((iMo22951k42 < 48 || iMo22951k42 > 57) && ((iMo22951k42 < 65 || iMo22951k42 > 90) && iMo22951k42 != 92 && iMo22951k42 != 95 && ((iMo22951k42 < 97 || iMo22951k42 > 122) && !m22275kk(this.f15409x1.mo22951k4(1)))))) {
                C5579bv c5579bv = this.f15418k4;
                c5579bv.f15365yj = 155;
                c5579bv.f15363up = 0;
                return;
            }
            m22349o3();
        }
    }

    /* JADX INFO: renamed from: z7 */
    public final void m22415z7() throws C5598um {
        if (this.f15409x1.mo22951k4(1) != 69 && this.f15409x1.mo22951k4(1) != 101) {
            C5593ne c5593ne = new C5593ne(null, this.f15409x1);
            mo22969kk(c5593ne);
            throw c5593ne;
        }
        this.f15409x1.mo22952k4();
        int iMo22951k4 = this.f15409x1.mo22951k4(1);
        if (iMo22951k4 == 43 || iMo22951k4 == 45) {
            if (this.f15409x1.mo22951k4(1) != 43 && this.f15409x1.mo22951k4(1) != 45) {
                C5593ne c5593ne2 = new C5593ne(null, this.f15409x1);
                mo22969kk(c5593ne2);
                throw c5593ne2;
            }
            this.f15409x1.mo22952k4();
        }
        int i = 0;
        while (true) {
            int iMo22951k42 = this.f15409x1.mo22951k4(1);
            if (iMo22951k42 < 48 || iMo22951k42 > 57) {
                break;
            }
            m22373sz();
            i++;
        }
        if (i < 1) {
            throw new C5584fa(10, this.f15409x1);
        }
    }

    /* JADX INFO: renamed from: zd */
    public final void m22416zd() throws C5598um {
        m22966k4(10);
    }

    /* JADX INFO: renamed from: ze */
    public final void m22417ze() throws C5598um {
        if ((this.f15409x1.mo22951k4(1) >= 0 && this.f15409x1.mo22951k4(1) <= 9) || ((this.f15409x1.mo22951k4(1) >= 11 && this.f15409x1.mo22951k4(1) <= 12) || ((this.f15409x1.mo22951k4(1) >= 14 && this.f15409x1.mo22951k4(1) <= 47) || ((this.f15409x1.mo22951k4(1) >= 58 && this.f15409x1.mo22951k4(1) <= 116) || ((this.f15409x1.mo22951k4(1) >= 118 && this.f15409x1.mo22951k4(1) <= 119) || ((this.f15409x1.mo22951k4(1) >= 121 && this.f15409x1.mo22951k4(1) <= 8231) || (this.f15409x1.mo22951k4(1) >= 8234 && this.f15409x1.mo22951k4(1) <= 65535))))))) {
            this.f15409x1.mo22952k4();
        } else {
            C5593ne c5593ne = new C5593ne(null, this.f15409x1);
            mo22969kk(c5593ne);
            throw c5593ne;
        }
    }

    /* JADX INFO: renamed from: zf */
    public final void m22418zf() throws C5598um {
        char c;
        m22285b5();
        int iMo22951k4 = this.f15409x1.mo22951k4(1);
        if ((iMo22951k4 >= 0 && iMo22951k4 <= 9) || ((iMo22951k4 >= 11 && iMo22951k4 <= 12) || ((iMo22951k4 >= 14 && iMo22951k4 <= 47) || ((iMo22951k4 >= 58 && iMo22951k4 <= 116) || ((iMo22951k4 >= 118 && iMo22951k4 <= 119) || ((iMo22951k4 >= 121 && iMo22951k4 <= 8231) || (iMo22951k4 >= 8234 && iMo22951k4 <= 65535))))))) {
            c = 1;
        } else if (iMo22951k4 >= 48 && iMo22951k4 <= 55) {
            c = 2;
        } else if (iMo22951k4 == 120) {
            c = 3;
        } else if (iMo22951k4 == 117) {
            c = 4;
        } else {
            if (iMo22951k4 != 10 && iMo22951k4 != 13) {
                throw new C5602wl("", 24, 0, this.f15409x1);
            }
            c = 5;
        }
        if (c == 1) {
            m22417ze();
            return;
        }
        if (c == 2) {
            m22400xb();
            return;
        }
        if (c == 3) {
            m22353ph();
            return;
        }
        if (c == 4) {
            m22306ei();
        } else {
            if (c != 5) {
                return;
            }
            if (this.f15409x1.mo22951k4(1) == 13) {
                m22329k1();
            }
            m22416zd();
        }
    }

    /* JADX INFO: renamed from: zj */
    public final void m22419zj() throws C5598um {
        m22972x1("long");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 50;
        c5579bv.f15363up = 0;
    }

    /* JADX INFO: renamed from: zm */
    public final void m22420zm() throws C5598um {
        m22972x1("==");
        C5579bv c5579bv = this.f15418k4;
        c5579bv.f15365yj = 76;
        c5579bv.f15363up = 0;
    }

    public C5445k4(InterfaceC5585h4 interfaceC5585h4) {
        this(interfaceC5585h4, new C5579bv());
    }

    public C5445k4(InterfaceC5585h4 interfaceC5585h4, C5579bv c5579bv) {
        super(interfaceC5585h4, c5579bv);
        this.f14458kk = new k4(this);
        this.f14459to = new x1(this);
    }
}
