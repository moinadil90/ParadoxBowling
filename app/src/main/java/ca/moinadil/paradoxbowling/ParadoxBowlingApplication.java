package ca.moinadil.paradoxbowling;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by Moin Adil on 2018-08-03.
 * Initializes properties of the application when the user starts it.
 */
public class ParadoxBowlingApplication extends Application {

    /** Identifies output from this class in Logcat. */
    @SuppressWarnings("unused")
    private static final String TAG = "ParadoxBowlingApplication";

    @SuppressWarnings("CheckStyle")
    @Override
    public void onCreate() {
        super.onCreate();

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        boolean convertScoreHighlight = false;
        String scoreHighlightStr;
        int scoreHighlightInt = 60;
        try {
            scoreHighlightStr = preferences.getString(Constants.KEY_HIGHLIGHT_SCORE, "300");
            scoreHighlightInt = Integer.parseInt(scoreHighlightStr);
            if (scoreHighlightInt > 90)
                convertScoreHighlight = true;
        } catch (Exception ex) {
            // does nothing
        }

        if (convertScoreHighlight) {
            preferences.edit()
                    .putString(Constants.KEY_HIGHLIGHT_SCORE, Integer.toString(scoreHighlightInt / 5))
                    .apply();
        }
    }
}
