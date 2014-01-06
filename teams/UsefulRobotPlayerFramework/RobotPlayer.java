package PieceOfShit;

import battlecode.common.Direction;
import battlecode.common.GameConstants;
import battlecode.common.RobotController;
import battlecode.common.RobotType;
import battlecode.common.*;
import java.util.*;

public class RobotPlayer
{
    public static void run(RobotController rc)
    {
        while (true)
        {

            // Check if Robot can do anything this round.
            if(rc.isActive())
            {

                // What will our HQ do?
                if(rc.getType() == RobotType.HQ)
                {

                }

                // What will our soldiers do?
                else
                {

                }
            }
            rc.yield();
        }
    }
}