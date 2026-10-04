package io.ktor.utils.p616io;

import androidx.core.location.LocationRequestCompat;
import io.ktor.utils.p616io.internal.OooOO0O;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.OooOOO0;
import oO00OOoo.C32250OooO0O0;
import oO00Oo0O.C32271OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: io.ktor.utils.io.OooooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C23988OooooOO {
    public static void OooO00o(StringBuilder sb, Object obj, InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
        OooOOO0.OooO0oO(sb, "<this>");
        if (interfaceC32507OooOO0o != null) {
            sb.append((CharSequence) interfaceC32507OooOO0o.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static final Object OooO0O0(InterfaceC23986Ooooo0o interfaceC23986Ooooo0o, InterfaceC23990Oooooo interfaceC23990Oooooo, long j, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        if (interfaceC23986Ooooo0o != interfaceC23990Oooooo) {
            return j == 0 ? new Long(0L) : ((interfaceC23986Ooooo0o instanceof OooO00o) && (interfaceC23990Oooooo instanceof OooO00o)) ? ((OooO00o) interfaceC23990Oooooo).Oooo0oO((OooO00o) interfaceC23986Ooooo0o, j, abstractC32479OooO0OO) : ((interfaceC23986Ooooo0o instanceof AbstractC23985Ooooo00) && (interfaceC23990Oooooo instanceof AbstractC23985Ooooo00)) ? OooOO0O.OooO0OO((AbstractC23985Ooooo00) interfaceC23986Ooooo0o, (AbstractC23985Ooooo00) interfaceC23990Oooooo, LocationRequestCompat.PASSIVE_INTERVAL, abstractC32479OooO0OO) : OooO0o0(interfaceC23986Ooooo0o, interfaceC23990Oooooo, j, abstractC32479OooO0OO);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final void OooO0OO(ByteBuffer copyTo, ByteBuffer destination, int i) {
        OooOOO0.OooO0oO(copyTo, "$this$copyTo");
        OooOOO0.OooO0oO(destination, "destination");
        int iRemaining = destination.remaining();
        if (copyTo.hasArray() && !copyTo.isReadOnly() && destination.hasArray() && !destination.isReadOnly()) {
            int iPosition = destination.position();
            System.arraycopy(copyTo.array(), copyTo.arrayOffset() + i, destination.array(), destination.arrayOffset() + iPosition, iRemaining);
            destination.position(iPosition + iRemaining);
        } else {
            ByteBuffer byteBufferDuplicate = copyTo.duplicate();
            byteBufferDuplicate.limit(iRemaining + i);
            byteBufferDuplicate.position(i);
            destination.put(byteBufferDuplicate);
        }
    }

    public static final void OooO0Oo(ByteBuffer copyTo, ByteBuffer destination, int i) {
        OooOOO0.OooO0oO(copyTo, "$this$copyTo");
        OooOOO0.OooO0oO(destination, "destination");
        if (!copyTo.hasArray() || copyTo.isReadOnly()) {
            OooO0o(destination, i, copyTo.remaining()).put(copyTo);
            return;
        }
        byte[] bArrArray = copyTo.array();
        OooOOO0.OooO0o(bArrArray, "array()");
        int iPosition = copyTo.position() + copyTo.arrayOffset();
        int iRemaining = copyTo.remaining();
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArrArray, iPosition, iRemaining).slice().order(ByteOrder.BIG_ENDIAN);
        OooOOO0.OooO0o(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        ByteBuffer byteBuffer = C32250OooO0O0.f115830OooO00o;
        C32250OooO0O0.OooO00o(byteBufferOrder, destination, 0, iRemaining, i);
        copyTo.position(copyTo.limit());
    }

    public static final ByteBuffer OooO0o(ByteBuffer byteBuffer, int i, int i2) {
        OooOOO0.OooO0oO(byteBuffer, "<this>");
        ByteBuffer myDuplicate$lambda$1 = byteBuffer.duplicate();
        OooOOO0.OooO0o(myDuplicate$lambda$1, "myDuplicate$lambda$1");
        myDuplicate$lambda$1.position(i);
        myDuplicate$lambda$1.limit(i + i2);
        ByteBuffer mySlice$lambda$2 = myDuplicate$lambda$1.slice();
        OooOOO0.OooO0o(mySlice$lambda$2, "mySlice$lambda$2");
        return mySlice$lambda$2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b A[Catch: all -> 0x00df, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00df, blocks: (B:38:0x00d5, B:40:0x00db, B:26:0x007b), top: B:59:0x00d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3 A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x0038, B:30:0x00aa, B:32:0x00b3, B:47:0x00ee, B:21:0x0057), top: B:55:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ca -> B:15:0x003c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0o0(InterfaceC23986Ooooo0o interfaceC23986Ooooo0o, InterfaceC23990Oooooo interfaceC23990Oooooo, long j, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C23987OooooO0 c23987OooooO0;
        InterfaceC23990Oooooo interfaceC23990Oooooo2;
        C32271OooO00o c32271OooO00o;
        long j2;
        ?? r10;
        long j3;
        InterfaceC23986Ooooo0o interfaceC23986Ooooo0o2;
        C23987OooooO0 c23987OooooO02;
        InterfaceC23990Oooooo interfaceC23990Oooooo3;
        InterfaceC23986Ooooo0o interfaceC23986Ooooo0o3;
        long j4;
        long j5;
        ?? r3;
        int iIntValue;
        long j6;
        if (abstractC32479OooO0OO instanceof C23987OooooO0) {
            c23987OooooO0 = (C23987OooooO0) abstractC32479OooO0OO;
            int i = c23987OooooO0.f80783OooOooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c23987OooooO0.f80783OooOooo = i - Integer.MIN_VALUE;
            } else {
                c23987OooooO0 = new C23987OooooO0(abstractC32479OooO0OO);
            }
        }
        Object obj = c23987OooooO0.f80782OooOooO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c23987OooooO0.f80783OooOooo;
        long j7 = 0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                j2 = j;
                c32271OooO00o = (C32271OooO00o) C32271OooO00o.f115976OooOO0O.o0000OoO();
                r10 = !interfaceC23990Oooooo.OooOOo();
                j3 = 0;
                interfaceC23986Ooooo0o2 = interfaceC23986Ooooo0o;
                c23987OooooO02 = c23987OooooO0;
                interfaceC23990Oooooo3 = interfaceC23990Oooooo;
                j6 = j2 - j3;
                if (j6 != j7) {
                }
            } else if (i2 == 1) {
                j5 = c23987OooooO0.f80779OooOoOO;
                int i3 = c23987OooooO0.f80781OooOoo0;
                j4 = c23987OooooO0.f80777OooOoO;
                c32271OooO00o = c23987OooooO0.f80778OooOoO0;
                interfaceC23990Oooooo2 = c23987OooooO0.f80775OooOo;
                interfaceC23986Ooooo0o3 = c23987OooooO0.f80776OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                r3 = i3;
                iIntValue = ((Number) obj).intValue();
                if (iIntValue != -1) {
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = c23987OooooO0.f80780OooOoo;
                j5 = c23987OooooO0.f80779OooOoOO;
                int i5 = c23987OooooO0.f80781OooOoo0;
                long j8 = c23987OooooO0.f80777OooOoO;
                c32271OooO00o = c23987OooooO0.f80778OooOoO0;
                interfaceC23990Oooooo2 = c23987OooooO0.f80775OooOo;
                InterfaceC23986Ooooo0o interfaceC23986Ooooo0o4 = c23987OooooO0.f80776OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                interfaceC23986Ooooo0o2 = interfaceC23986Ooooo0o4;
                int i6 = i5;
                C23987OooooO0 c23987OooooO03 = c23987OooooO0;
                interfaceC23990Oooooo3 = interfaceC23990Oooooo2;
                long j9 = j5 + ((long) i4);
                if (i6 != 0) {
                    try {
                        if (interfaceC23986Ooooo0o2.OooO0OO() == 0) {
                            interfaceC23990Oooooo3.flush();
                        }
                    } catch (Throwable th) {
                        th = th;
                        interfaceC23990Oooooo2 = interfaceC23990Oooooo3;
                        try {
                            interfaceC23990Oooooo2.OooO0Oo(th);
                            throw th;
                        } finally {
                            c32271OooO00o.OooOO0(C32271OooO00o.f115976OooOO0O);
                        }
                    }
                }
                long j10 = j8;
                j3 = j9;
                j2 = j10;
                c23987OooooO02 = c23987OooooO03;
                j7 = 0;
                r10 = i6;
                j6 = j2 - j3;
                if (j6 != j7) {
                    int iMin = (int) Math.min(c32271OooO00o.f115948OooO0o, j6);
                    int i7 = c32271OooO00o.f115947OooO0Oo;
                    c32271OooO00o.f115945OooO0O0 = i7;
                    c32271OooO00o.f115946OooO0OO = i7;
                    c32271OooO00o.f115949OooO0o0 = iMin;
                    c23987OooooO02.f80776OooOo0o = interfaceC23986Ooooo0o2;
                    c23987OooooO02.f80775OooOo = interfaceC23990Oooooo3;
                    c23987OooooO02.f80778OooOoO0 = c32271OooO00o;
                    c23987OooooO02.f80777OooOoO = j2;
                    c23987OooooO02.f80781OooOoo0 = r10;
                    c23987OooooO02.f80779OooOoOO = j3;
                    c23987OooooO02.f80783OooOooo = 1;
                    Object objOooOOOo = interfaceC23986Ooooo0o2.OooOOOo(c32271OooO00o, c23987OooooO02);
                    if (objOooOOOo != enumC32485OooO00o) {
                        interfaceC23990Oooooo2 = interfaceC23990Oooooo3;
                        c23987OooooO0 = c23987OooooO02;
                        r3 = r10;
                        interfaceC23986Ooooo0o3 = interfaceC23986Ooooo0o2;
                        obj = objOooOOOo;
                        j4 = j2;
                        j5 = j3;
                        iIntValue = ((Number) obj).intValue();
                        if (iIntValue != -1) {
                            j3 = j5;
                            return new Long(j3);
                        }
                        c23987OooooO0.f80776OooOo0o = interfaceC23986Ooooo0o3;
                        c23987OooooO0.f80775OooOo = interfaceC23990Oooooo2;
                        c23987OooooO0.f80778OooOoO0 = c32271OooO00o;
                        c23987OooooO0.f80777OooOoO = j4;
                        c23987OooooO0.f80781OooOoo0 = r3;
                        c23987OooooO0.f80779OooOoOO = j5;
                        c23987OooooO0.f80780OooOoo = iIntValue;
                        c23987OooooO0.f80783OooOooo = 2;
                        if (interfaceC23990Oooooo2.OooOOOO(c32271OooO00o, c23987OooooO0) != enumC32485OooO00o) {
                            ?? r4 = r3;
                            i4 = iIntValue;
                            interfaceC23986Ooooo0o2 = interfaceC23986Ooooo0o3;
                            j8 = j4;
                            i6 = r4 == true ? 1 : 0;
                            C23987OooooO0 c23987OooooO032 = c23987OooooO0;
                            interfaceC23990Oooooo3 = interfaceC23990Oooooo2;
                            long j92 = j5 + ((long) i4);
                            if (i6 != 0) {
                            }
                            long j102 = j8;
                            j3 = j92;
                            j2 = j102;
                            c23987OooooO02 = c23987OooooO032;
                            j7 = 0;
                            r10 = i6;
                            j6 = j2 - j3;
                            if (j6 != j7) {
                                interfaceC23990Oooooo2 = interfaceC23990Oooooo3;
                                return new Long(j3);
                            }
                        }
                    }
                    return enumC32485OooO00o;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
