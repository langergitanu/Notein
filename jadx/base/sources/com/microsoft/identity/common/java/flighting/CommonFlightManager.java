package com.microsoft.identity.common.java.flighting;

/* JADX INFO: loaded from: classes9.dex */
public class CommonFlightManager {
    private static IFlightsProvider mFlightProvider;

    public static int getIntValue(IFlightConfig iFlightConfig) {
        if (iFlightConfig == null) {
            throw new NullPointerException("flightConfig is marked non-null but is null");
        }
        IFlightsProvider iFlightsProvider = mFlightProvider;
        return iFlightsProvider == null ? ((Integer) iFlightConfig.getDefaultValue()).intValue() : iFlightsProvider.getIntValue(iFlightConfig);
    }

    public static boolean isFlightEnabled(IFlightConfig iFlightConfig) {
        if (iFlightConfig == null) {
            throw new NullPointerException("flightConfig is marked non-null but is null");
        }
        IFlightsProvider iFlightsProvider = mFlightProvider;
        return iFlightsProvider == null ? ((Boolean) iFlightConfig.getDefaultValue()).booleanValue() : iFlightsProvider.isFlightEnabled(iFlightConfig);
    }

    public static void setFlightProvider(IFlightsProvider iFlightsProvider) {
        if (iFlightsProvider == null) {
            throw new NullPointerException("flightProvider is marked non-null but is null");
        }
        mFlightProvider = iFlightsProvider;
    }
}
