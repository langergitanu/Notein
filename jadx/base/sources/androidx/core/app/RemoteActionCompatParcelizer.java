package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(o00O000o.OooO00o oooO00o) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        o00O000o.OooO0OO oooO0OOOooOOO0 = remoteActionCompat.mIcon;
        if (oooO00o.OooO0oo(1)) {
            oooO0OOOooOOO0 = oooO00o.OooOOO0();
        }
        remoteActionCompat.mIcon = (IconCompat) oooO0OOOooOOO0;
        CharSequence charSequenceOooO0oO = remoteActionCompat.mTitle;
        if (oooO00o.OooO0oo(2)) {
            charSequenceOooO0oO = oooO00o.OooO0oO();
        }
        remoteActionCompat.mTitle = charSequenceOooO0oO;
        CharSequence charSequenceOooO0oO2 = remoteActionCompat.mContentDescription;
        if (oooO00o.OooO0oo(3)) {
            charSequenceOooO0oO2 = oooO00o.OooO0oO();
        }
        remoteActionCompat.mContentDescription = charSequenceOooO0oO2;
        Parcelable parcelableOooOO0O = remoteActionCompat.mActionIntent;
        if (oooO00o.OooO0oo(4)) {
            parcelableOooOO0O = oooO00o.OooOO0O();
        }
        remoteActionCompat.mActionIntent = (PendingIntent) parcelableOooOO0O;
        boolean zOooO0o0 = remoteActionCompat.mEnabled;
        if (oooO00o.OooO0oo(5)) {
            zOooO0o0 = oooO00o.OooO0o0();
        }
        remoteActionCompat.mEnabled = zOooO0o0;
        boolean zOooO0o02 = remoteActionCompat.mShouldShowIcon;
        if (oooO00o.OooO0oo(6)) {
            zOooO0o02 = oooO00o.OooO0o0();
        }
        remoteActionCompat.mShouldShowIcon = zOooO0o02;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, o00O000o.OooO00o oooO00o) {
        oooO00o.getClass();
        IconCompat iconCompat = remoteActionCompat.mIcon;
        oooO00o.OooOOO(1);
        oooO00o.OooOo0O(iconCompat);
        CharSequence charSequence = remoteActionCompat.mTitle;
        oooO00o.OooOOO(2);
        oooO00o.OooOOo0(charSequence);
        CharSequence charSequence2 = remoteActionCompat.mContentDescription;
        oooO00o.OooOOO(3);
        oooO00o.OooOOo0(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.mActionIntent;
        oooO00o.OooOOO(4);
        oooO00o.OooOo00(pendingIntent);
        boolean z = remoteActionCompat.mEnabled;
        oooO00o.OooOOO(5);
        oooO00o.OooOOOO(z);
        boolean z2 = remoteActionCompat.mShouldShowIcon;
        oooO00o.OooOOO(6);
        oooO00o.OooOOOO(z2);
    }
}
