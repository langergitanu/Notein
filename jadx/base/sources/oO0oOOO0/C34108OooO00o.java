package oO0oOOO0;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: oO0oOOO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34108OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final TimeZone f122561OooO00o = TimeZone.getTimeZone("GMT");

    public static final C34109OooO0O0 OooO00o(Long l) {
        Calendar calendar = Calendar.getInstance(f122561OooO00o, Locale.ROOT);
        OooOOO0.OooO0Oo(calendar);
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        int i = calendar.get(16) + calendar.get(15);
        return new C34109OooO0O0(calendar.get(13), calendar.get(12), calendar.get(11), EnumC34111OooO0Oo.values()[(calendar.get(7) + 5) % 7], calendar.get(5), calendar.get(6), EnumC34110OooO0OO.values()[calendar.get(2)], calendar.get(1), calendar.getTimeInMillis() + ((long) i));
    }
}
