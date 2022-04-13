package gof_07_facade;

import gof_07_facade.service.LetterProcess;
import gof_07_facade.service.LetterProcessImpl;
import gof_07_facade.service.Police;
import gof_07_facade.service.PoliceImpl;

/**
 * @author zhr
 */
public class ModelPostOffice {
  LetterProcess letterProcess = new LetterProcessImpl();

  Police police = new PoliceImpl();

  public void sendLetter(String context, String address) {
    letterProcess.writeContext(context);

    letterProcess.fillEnvelope(address);

    police.checkLetter(context);

    letterProcess.letterInfoEnvelope();

    letterProcess.sendLetter();
  }
}
