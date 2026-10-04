package com.orion.notein.domain.models.papertheme;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/ThemeUtils;", "", "<init>", "()V", "TAG", "", "getThemeDownloadDir", "Ljava/io/File;", "context", "Landroid/content/Context;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ThemeUtils {
    public static final ThemeUtils INSTANCE = new ThemeUtils();
    private static final String TAG = "ThemeDownloader";

    private ThemeUtils() {
    }

    public final File getThemeDownloadDir(Context context) {
        OooOOO0.OooO0oO(context, "context");
        return new File(context.getFilesDir(), "theme");
    }
}
