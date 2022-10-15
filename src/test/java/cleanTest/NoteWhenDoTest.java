package cleanTest;

import activity.whenDo.CreateNoteForm;
import activity.whenDo.MainScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

public class NoteWhenDoTest {
    MainScreen mainScreen = new MainScreen();
    CreateNoteForm createNoteForm = new CreateNoteForm();
    private String title;

    @BeforeEach
    public void init(){
        this.title ="Titulo del Test";
        String note="Esta es una nota";

        mainScreen.addNoteButton.click();
        createNoteForm.titleTxtBox.setText(this.title);
        createNoteForm.noteTxtBox.setText(note);
        createNoteForm.saveButton.click();

    }

    @Test
    public void verifyCreateNewNote(){

        Assertions.assertTrue(mainScreen.isNoteDisplayed(this.title),
                "ERROR, the note was not created");

    }

    @Test
    public void verifyUpdateNoteCreated(){

        String titleUpdate="nota actualizada";
        String noteUpdate="la nota actualizada";

        Assertions.assertTrue(mainScreen.isNoteDisplayed(title),
                "ERROR, the note was not created");

        mainScreen.noteButton.click();
        createNoteForm.titleTxtBox.setText(titleUpdate);
        createNoteForm.noteTxtBox.setText(noteUpdate);
        createNoteForm.saveButton.click();

        Assertions.assertTrue(mainScreen.isNoteDisplayed(titleUpdate),
                "ERROR, the title was not update");
        Assertions.assertTrue(mainScreen.isNoteDisplayed(noteUpdate),
                "ERROR, the description was not update");
    }

    @Test
    public void verifyNoteDeleted(){

        Assertions.assertTrue(mainScreen.isNoteDisplayed(title),
                "ERROR, the note was not created");

        mainScreen.noteButton.click();
        createNoteForm.deleteButton.click();
        createNoteForm.confirmDeleteYesButton.click();

        Assertions.assertFalse(mainScreen.isNoteDisplayed(this.title),
                "ERROR, the title was not delete");
    }

    @AfterEach
    public void closeApp(){
        Session.getInstance().closeApp();
    }

}
