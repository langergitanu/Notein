package com.orion.notein.p607ui.backup.netdisk;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.OooO00o;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.backup.netdisk.auth.BaiduNetDiskAuthFragment;
import com.orion.notein.p607ui.backup.netdisk.auth.GoogleDriveAuthFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0Oo0.AbstractActivityC28097OooO0Oo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/backup/netdisk/NetDiskAuthorizeActivity;", "Landroidx/appcompat/app/OooO0oo;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class NetDiskAuthorizeActivity extends AbstractActivityC28097OooO0Oo {
    public NetDiskAuthorizeActivity() {
        super(0);
    }

    @Override // o0Oo0Oo0.AbstractActivityC28097OooO0Oo, androidx.fragment.app.ActivityC21897OooOo0, OooO0Oo.OooOO0O, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_netdisk_auth);
        if (bundle == null) {
            int intExtra = getIntent().getIntExtra("vendor_id", BackupFile.DiskVendor.None.ordinal());
            Bundle bundleBundleOf = BundleKt.bundleOf(new C32443OooOOO("vendor_id", Integer.valueOf(intExtra)));
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            OooOOO0.OooO0o(supportFragmentManager, "getSupportFragmentManager(...)");
            OooO00o oooO00o = new OooO00o(supportFragmentManager);
            oooO00o.f65021OooOOo = true;
            if (intExtra == BackupFile.DiskVendor.Baidu.ordinal()) {
                oooO00o.OooO0O0(bundleBundleOf, BaiduNetDiskAuthFragment.class);
            } else if (intExtra == BackupFile.DiskVendor.GoogleDrive.ordinal()) {
                oooO00o.OooO0O0(bundleBundleOf, GoogleDriveAuthFragment.class);
            } else {
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
            oooO00o.OooO0oo();
        }
    }
}
