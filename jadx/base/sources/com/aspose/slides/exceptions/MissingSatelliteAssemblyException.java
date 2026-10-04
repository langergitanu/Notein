package com.aspose.slides.exceptions;

/* JADX INFO: loaded from: classes3.dex */
public class MissingSatelliteAssemblyException extends SystemException {

    /* JADX INFO: renamed from: k4 */
    private String f4897k4;

    public MissingSatelliteAssemblyException() {
        super("The satellite assembly was not found for the required culture.");
    }

    public String getCultureName() {
        return this.f4897k4;
    }

    public MissingSatelliteAssemblyException(String str) {
        super(str);
    }

    public MissingSatelliteAssemblyException(String str, Exception exception) {
        super(str, exception);
    }

    public MissingSatelliteAssemblyException(String str, String str2) {
        super(str);
        this.f4897k4 = str2;
    }
}
